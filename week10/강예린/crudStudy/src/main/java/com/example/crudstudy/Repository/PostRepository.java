package com.example.crudstudy.Repository;

import com.example.crudstudy.Entity.Post;

import java.util.List;

public interface PostRepository  {
    List<Post> findAll();
    Post save(Post post);
}
