package com.example.week10_jdbc;

import com.example.week10_jdbc.repository.JdbcRepository;
import com.example.week10_jdbc.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
public class Config {

    private final DataSource dataSource;

    public Config(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public JdbcRepository repository() {
        return new JdbcRepository(dataSource);
    }

    @Bean
    public PostService service(JdbcRepository repository) {
        return new PostService(repository);
    }
}
