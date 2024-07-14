package com.example.demo2.config;

import com.example.demo2.repository.PostDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PostDAO postDAO() {
        return new PostDAO();
    }
}
