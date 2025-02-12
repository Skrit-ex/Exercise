package com.example.configuration;

import com.example.service.UserService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @SneakyThrows
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) {
        return httpSecurity
                .authorizeHttpRequests(request ->
                        request.requestMatchers("/", "/home", "/reg", "/css/**", "/js/**", "/images/**")
                                .permitAll()
//                                .requestMatchers("/library/**")
//                                .permitAll()
                                .requestMatchers("/editing").hasRole("ADMIN")
                                .anyRequest()
                                .authenticated()
                )
                .formLogin(login ->
                        login.loginPage("/login").permitAll()
                                .defaultSuccessUrl("/library", true)
                                .permitAll()
                )
                .logout(logout ->
                        logout.permitAll()
                )
                .csrf(csrf -> csrf.disable())
                .build();
    }
}
