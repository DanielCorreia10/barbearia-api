package com.example.barbearia_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Desabilita o CSRF (necessário para testes em APIs REST com POST/PUT)
                .csrf(csrf -> csrf.disable())

                // Configura as permissões de acesso
                .authorizeHttpRequests(auth -> auth
                        // Libera todas as rotas da API para acesso público por enquanto
                        .anyRequest().permitAll()
                );

        return http.build();
    }
}