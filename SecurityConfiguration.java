package com.bws.donationmgmt.profile.infra.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration
{
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable()//csrf(AbstractHttpConfigurer::disable)//
                .authorizeHttpRequests()
                .requestMatchers("/api/test/**", "/v2/api-docs", "/swagger-ui/**","/swagger-resources/**","/webjars/**").permitAll()
               .requestMatchers("/api-docs/**").permitAll()
                .anyRequest()
                .authenticated()
                .and().formLogin();
        return httpSecurity.build();
    }
}





