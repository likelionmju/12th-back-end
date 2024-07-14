package com.example.week10.controller;

import com.example.week10.entity.PostEntity;
import com.example.week10.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/week10/post")
public class PostController {
    @Autowired
    private PostService service;

    @GetMapping
    public List<PostEntity> get(){
        return this.service.get();
    }

    @GetMapping("search/{id}")
    public Optional<PostEntity> getPostById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public void createPost(@RequestBody PostEntity entity) {
        service.create(entity);
    }

    @PutMapping
    public PostEntity updatePost(@RequestBody PostEntity entity){
        return service.update(entity);
    }
    @DeleteMapping("{id}")
    public void deletePost(@PathVariable Long id){
        this.service.delete(id);
    }




}
