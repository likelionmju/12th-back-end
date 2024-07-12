package com.example.crudstudy.Service;

import com.example.crudstudy.Entity.Post;
import com.example.crudstudy.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts(){
        return this.postRepository.findAll();
    }

    public Post createPost(Post post) {
        return this.postRepository.save(post);
    }
}
