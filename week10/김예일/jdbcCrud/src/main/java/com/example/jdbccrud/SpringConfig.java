package com.example.jdbccrud;


import com.example.jdbccrud.controller.PostController;
import com.example.jdbccrud.repository.JdbcPostRepository;
import com.example.jdbccrud.repository.PostRepository;
import com.example.jdbccrud.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;


@Configuration
public class SpringConfig {

    private DataSource dataSource;

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
    }

}
