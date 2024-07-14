package com.example.demo.controller;

import com.example.demo.entity.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts") // 딴애들은 다 딴애들이 부르는데 컨트롤러는 안불러 줘서 우리가 해야함
public class likeController {
    @Autowired
    private PostService postService;

    @PostMapping
    public void createPost(@RequestBody Post post){
        this.postService.createPost(post);
    }

    @GetMapping
    public List<Post> getAllPosts(){
        return this.postService.getAllPosts();
    }

    @PutMapping("/{id}")
    public void updatePost(@PathVariable Long id, @RequestBody Post post){
        postService.updatePost(id, post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deletePost(id);
    }
}

