package com.example.demo2.controller;

import com.example.demo2.entity.PostDTO;
import com.example.demo2.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/api/posts")
public class likeController {
    private final PostService postService;

    public likeController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDTO> getPostById(@PathVariable Long id) throws SQLException {
        PostDTO post = postService.getPostById(id);
        return ResponseEntity.ok(post);
    }

    @PostMapping
    public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO post) throws SQLException {
        postService.savePost(post);
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }
}
