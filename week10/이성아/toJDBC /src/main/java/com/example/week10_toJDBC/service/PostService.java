package com.example.week10_toJDBC.service;

import com.example.week10_toJDBC.entity.Post;
import com.example.week10_toJDBC.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return this.postRepository.findAll();
    }

    public int createPost(Post post) {
        return this.postRepository.save(post);
    }
}
