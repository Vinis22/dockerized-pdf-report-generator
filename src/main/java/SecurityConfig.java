import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Release all routes
                )
                .csrf(csrf -> csrf.disable()) // Disable CSRF
                .headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable())); // Disable frameOptions without using deprecated method
        return http.build();
    }
}
