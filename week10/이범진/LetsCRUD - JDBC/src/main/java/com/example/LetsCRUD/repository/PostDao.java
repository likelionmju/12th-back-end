package com.example.LetsCRUD.repository;

import com.example.LetsCRUD.entity.Post;

import java.util.List;

public interface PostDao {
    List<Post> findAll();
    void save(Post post);
}
