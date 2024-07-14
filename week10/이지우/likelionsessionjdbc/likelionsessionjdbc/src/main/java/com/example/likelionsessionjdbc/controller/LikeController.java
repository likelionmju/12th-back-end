package com.example.likelionsessionjdbc.controller;

import com.example.likelionsessionjdbc.entity.Post;
import com.example.likelionsessionjdbc.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class LikeController {

    private PostService postService;

    public LikeController(PostService postService){
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return this.postService.getAllPosts();
    }

    @PostMapping
    public void createPost(@RequestBody Post post) {
        this.postService.createPost(post);
    }

}
