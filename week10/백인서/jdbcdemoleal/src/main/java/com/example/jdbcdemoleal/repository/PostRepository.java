package com.example.jdbcdemoleal.repository;
import com.example.jdbcdemoleal.entity.Post;
import java.util.List;

public interface PostRepository {
    List<Post> findAll();
    void save(Post post);
}
