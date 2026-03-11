package com.jsp.VoyageHub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){

        return http.authorizeHttpRequests(auth->
                auth.requestMatchers("/api/auth/**").permitAll()
                        .anyRequest().authenticated())
                .httpBasic(form->form.disable())
                .httpBasic(Customizer.withDefaults())
                .csrf(csrf->csrf.disable())
                .build();
    }
}
