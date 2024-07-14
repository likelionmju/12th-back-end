package com.example.likelionsessionjdbc.service;

import com.example.likelionsessionjdbc.entity.Post;
import com.example.likelionsessionjdbc.repository.PostRepository;

import java.util.List;

public class PostService {

    private PostRepository postRepository;
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts(){
        return this.postRepository.findAll();
    }


    public void createPost(Post post) {
        this.postRepository.save(post);
    }
}
