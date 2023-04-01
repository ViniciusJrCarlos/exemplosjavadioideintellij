package dio.diospringsecurity;

//import org.springframework.context.annotation.Bean;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigureAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)

public class WebSecurityConfig extends WebSecurityConfigurerAdapter  {

    @Override
    //@Bean
    protected void configure(@NotNull HttpSecurity http) throws Exception{

        http.authorizeRequests()

                    .antMatchers(...antPatterns: "/").permitAll()
                    .antMatchers(HttpMethod.POST, ...antPatterns: "/login").permitAll()
                    .antMatchers(...antPatterns: "/managers").hasAnyRole( "MANAGERS")
                    .antMatchers(...antPatterns: "/users").hasAnyRole(...roles: "USERS", "MANAGERS")
                    .anyRequest().authenticated().and().formLogin();


    }
   @Override
    //@Bean
    protected void configure(@NotNull AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication() inMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder>
                .withUser(username: "user") UserDetailsManagerConfigurer<...>.UserDetailsBuilder
                .password("{noop}user123")
                .roles("USERS")
                .and() InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder>
                .withUser(username: "admin") UserDetailsManagerConfigurer<...>.UserDetailsBuilder
                .password("{noop}master123")
                .roles("MANAGERS");

    }



}
