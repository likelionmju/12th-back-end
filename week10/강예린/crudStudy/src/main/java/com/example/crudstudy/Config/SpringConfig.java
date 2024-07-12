package com.example.crudstudy.Config;

import com.example.crudstudy.Repository.JdbcPostRepository;
import com.example.crudstudy.Repository.PostRepository;
import com.example.crudstudy.Service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private final DataSource dataSource;
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Bean
    public PostService postService() {
        return new PostService(postRepository());
    }
    @Bean
    public PostRepository postRepository() {
        return new JdbcPostRepository(dataSource);
    }}
