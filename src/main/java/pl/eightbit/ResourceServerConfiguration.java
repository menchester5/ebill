package pl.eightbit;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@Configuration
@EnableResourceServer
class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(final HttpSecurity http) throws Exception {
        http.antMatcher("/api/**").authorizeRequests()
                .antMatchers("/receipt-details/**").permitAll()
                .anyRequest().authenticated()
                .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());

    }


}
