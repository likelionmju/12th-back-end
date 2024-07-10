package com.example.jdbc.Repository;

import com.example.jdbc.Entity.Post;
import java.util.List;

public interface PostRepository {
  List<Post> findAll();
  void save(Post post);
  void update(Long id, Post post);
  void delete(Long id);
}
