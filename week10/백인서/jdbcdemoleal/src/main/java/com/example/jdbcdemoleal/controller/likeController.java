package com.example.jdbcdemoleal.controller;

import com.example.jdbcdemoleal.entity.Post;
import com.example.jdbcdemoleal.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class likeController {

    private final PostService postService;

    @Autowired
    public likeController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping
    public void createPost(@RequestBody Post post) {
        postService.createPost(post);
    }
}
