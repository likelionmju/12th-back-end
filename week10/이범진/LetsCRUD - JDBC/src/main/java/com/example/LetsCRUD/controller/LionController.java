package com.example.LetsCRUD.controller;

import com.example.LetsCRUD.entity.Post;
import com.example.LetsCRUD.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class LionController {

    private final PostService postService;

    @Autowired
    public LionController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.retrieveAllPosts();
    }

    @PostMapping
    public void createPost(@RequestBody Post post) {
        postService.createPost(post);
    }
}
