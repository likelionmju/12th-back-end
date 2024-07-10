package com.example.democrud.controller;


import com.example.democrud.entity.Post;
import com.example.democrud.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService){
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts(){
        return postService.findAll();
    }

    @PostMapping
    public Post createPost(@RequestBody Post post){
        return postService.createSight(post);
    }

    @PutMapping
    public Post updatePost(@RequestBody Post post){
        return postService.updateSight(post);
    }

    @DeleteMapping
    public void deletePost(@RequestParam Long id){
        this.postService.deleteSight(id);
    }

}
