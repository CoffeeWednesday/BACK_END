package com.clone.carrotmarket.config;

import jakarta.servlet.DispatcherType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SpringSecurityConfig{
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf().disable().cors().disable()
            .authorizeHttpRequests(request -> request
                .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
                .requestMatchers("/", "/**", "/h2-console/**", "/members/**").permitAll()
                // .anyRequest().authenticated()
                );
            // .and()
            //     .csrf() // 추가
            // .ignoringAntMatchers("/h2-console/**").disable() // 추가
            // .httpBasic();
        return http.build();
    }

    
    // Security 무시하기 
    public void configure(WebSecurity web)throws Exception{
        web.ignoring().requestMatchers("/h2-console/**");
    }
}
