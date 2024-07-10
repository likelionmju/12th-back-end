package com.example.jdbc.Repository;

import com.example.jdbc.Entity.Post;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepositoryImpl implements PostRepository {

  private final JdbcTemplate jdbcTemplate;

  public PostRepositoryImpl(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public List<Post> findAll() {
    String sql = "SELECT * FROM posts";
    return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Post.class));
  }

  @Override
  public void save(Post post) {
    String sql = "INSERT INTO posts (title, content) VALUES (?, ?)";
    jdbcTemplate.update(sql, post.getTitle(), post.getContent());
  }

  @Override
  public void update(Long id, Post post) {
    String sql = "UPDATE posts SET title = ?, content = ? WHERE id = ?";
    jdbcTemplate.update(sql, post.getTitle(), post.getContent(), id);
  }

  @Override
  public void delete(Long id) {
    String sql = "DELETE FROM posts WHERE id = ?";
    jdbcTemplate.update(sql, id);
  }
}
