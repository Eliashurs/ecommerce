package com.eliasspringi.ecommerce.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Kytketään CSRF-suojaus pois päältä, jotta voimme tehdä POST-pyyntöjä ilman tokeneita
                .csrf(AbstractHttpConfigurer::disable)

                // Määritetään reittien oikeudet
                .authorizeHttpRequests(auth -> auth
                        // Sallitaan kaikki pyynnöt, jotka alkavat /api/
                        .requestMatchers("/api/**").permitAll()
                        // Kaikki muut sovelluksen osoitteet vaativat edelleen kirjautumisen
                        .anyRequest().authenticated()
                );

        return http.build();  }}
