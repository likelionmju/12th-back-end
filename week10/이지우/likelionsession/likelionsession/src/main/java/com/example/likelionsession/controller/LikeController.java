package com.example.likelionsession.controller;

import com.example.likelionsession.entity.Post;
import com.example.likelionsession.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class LikeController {
    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAllPosts(){
        return this.postService.getAllPosts();
    }

    @PostMapping
    public void createPost(@RequestBody Post post){
        this.postService.createPost(post);
    }

    @PatchMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Post post){
        this.postService.updatePost(id,post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id){
        postService.deletePostById(id);
    }


}
