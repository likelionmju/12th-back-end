package com.example.jdbccrud.repository;

import com.example.jdbccrud.entity.Post;

import java.util.List;

public interface PostRepository {

    Post save(Post post);
    Long delete(Long id);
    Post update(Post post);
    List<Post> findAll();
    Post findById(Long id);
}
