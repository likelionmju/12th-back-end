package com.example.week10.controller;

import com.example.week10.entity.Post;
import com.example.week10.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return this.postService.getAllPosts();
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return this.postService.createPost(post);
    }

    @PutMapping
    public Post updatePost(@RequestBody Post post) {
        return postService.updatePost(post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@RequestBody Long id) {
        this.postService.deletePost(id);
    }
}
