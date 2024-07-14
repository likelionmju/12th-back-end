package com.example.likelionsessionjdbc.repository;

import com.example.likelionsessionjdbc.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    Post save(Post post);


    List<Post> findAll();




}
