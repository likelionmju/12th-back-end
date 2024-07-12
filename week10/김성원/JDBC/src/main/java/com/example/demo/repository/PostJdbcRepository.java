package com.example.demo.repository;

import com.example.demo.entity.Post;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PostJdbcRepository {

    private final JdbcTemplate jdbcTemplate;

    public PostJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Post> findAll() {
        return jdbcTemplate.query("SELECT * FROM posts", new PostRowMapper());
    }

    public void save(Post post) {
        jdbcTemplate.update("INSERT INTO posts (title, content, author) VALUES (?, ?, ?)",
                post.getTitle(), post.getContent(), post.getAuthor());
    }

    private static class PostRowMapper implements RowMapper<Post> {
        @Override
        public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
            Post post = new Post();
            post.setId(rs.getLong("id"));
            post.setTitle(rs.getString("title"));
            post.setContent(rs.getString("content"));
            post.setAuthor(rs.getString("author"));
            return post;
        }
    }
}
