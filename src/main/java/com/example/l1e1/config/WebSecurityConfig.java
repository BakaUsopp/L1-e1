package com.example.l1e1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSecurityConfig {


    @Bean
    public UserDetailsService userDetailsService() {


        var user = new InMemoryUserDetailsManager();

        var u1 = User.withUsername("Usopp")
                .password("1234")
                .authorities("read")
                .build();
        user.createUser(u1);

        return user;

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

}
