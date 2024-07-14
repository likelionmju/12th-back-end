package com.example.likelionsessionjdbc.service;

import com.example.likelionsessionjdbc.repository.JdbcPostRepository;
import com.example.likelionsessionjdbc.repository.PostRepository;
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
    public PostService postService(){
        return new PostService(postRepository(dataSource));
    }

    @Bean
    public PostRepository postRepository(DataSource dataSource){
        return new JdbcPostRepository(dataSource);
    }
}
