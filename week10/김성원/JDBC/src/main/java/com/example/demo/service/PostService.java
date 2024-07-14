package com.example.demo.service;

import com.example.demo.entity.Post;
import com.example.demo.repository.PostJdbcRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostJdbcRepository postRepository;

    public PostService(PostJdbcRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public void createPost(Post post) {
        postRepository.save(post);
    }
}
