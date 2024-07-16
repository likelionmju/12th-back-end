package com.example.jdbcdemoleal.repository;
import com.example.jdbcdemoleal.entity.Post;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PostRepositoryImpl implements PostRepository {
    private final JdbcTemplate jdbcTemplate;

    public PostRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Post> findAll() {
        String sql = "SELECT * FROM post";
        return jdbcTemplate.query(sql, new PostRowMapper());
    }

    @Override
    public void save(Post post) {
        String sql = "INSERT INTO post (title, content) VALUES (?, ?)";
        jdbcTemplate.update(sql, post.getTitle(), post.getContent());
    }

    private static class PostRowMapper implements RowMapper<Post> {
        @Override
        public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Post(rs.getLong("id"), rs.getString("title"), rs.getString("content"));
        }
    }
}
