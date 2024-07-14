package com.example.LetsCRUD.service;

import com.example.LetsCRUD.repository.JdbcPostDao;
import com.example.LetsCRUD.repository.PostDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class SpringConfig {

    @Bean
    public PostDao postDao(JdbcTemplate jdbcTemplate) {
        return new JdbcPostDao(jdbcTemplate);
    }

    @Bean
    public PostService postService(PostDao postDao) {
        return new PostService(postDao);
    }
}