package com.example.demo.service;

import com.example.demo.entity.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {


    @Autowired
    private PostRepository postRepository;


    public List<Post> getAllPosts() {
        return this.postRepository.findAll();
    }


    public void createPost(Post post) {
        this.postRepository.save(post);
    }

    public void updatePost(Long id, Post post) {
        Optional<Post> existingPost = this.postRepository.findById(id);
        if (existingPost.isPresent()) {
            Post updatedPost = existingPost.get();
            updatedPost.setTitle(post.getTitle());
            updatedPost.setContent(post.getContent());
            // 필요한 다른 필드들도 업데이트
            this.postRepository.save(updatedPost);
        } else {
            throw new RuntimeException("Post not found with id " + id);
        }
    }


    public void deletePost(Long id) {
        this.postRepository.deleteById(id);
    }
}
