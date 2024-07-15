package com.example.week10_toJDBC.repository;

import com.example.week10_toJDBC.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Post> findAll() {
        String sql = "SELECT * FROM posts";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Post.class));
    }

    public int save(Post post) {
        String sql = "INSERT INTO posts (title, content) VALUES (?, ?)";
        return jdbcTemplate.update(sql, post.getTitle(), post.getContent());
    }
}
