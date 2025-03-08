/*package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
/*@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()  // Désactivez CSRF si vous utilisez des sessions pour éviter les problèmes de cookies
            .authorizeRequests()
                .antMatchers("/api/auth/**").permitAll()  // Autoriser l'accès à l'authentification sans sécurité
                .antMatchers("/api/clients/**").authenticated()  // Autoriser uniquement les utilisateurs authentifiés pour l'accès aux clients
                .antMatchers("/api/reclamations/**").authenticated()  // Autoriser uniquement les utilisateurs authentifiés pour l'accès aux réclamations
                .anyRequest().authenticated()
            .and()
            .formLogin()  // Utilisation de l'authentification basée sur formulaire
                .loginPage("/login")  // URL de la page de login
                .permitAll()
            .and()
            .logout()
                .permitAll();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();  // Utilisation de l'encodeur de mots de passe BCrypt
    }
}*/







/*package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig {

    // Création du bean PasswordEncoder
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
*/

