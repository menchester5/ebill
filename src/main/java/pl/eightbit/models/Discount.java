package pl.eightbit.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Discount implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private BigDecimal amount;

    @Version
    @JsonIgnore
    private Long version;
}
