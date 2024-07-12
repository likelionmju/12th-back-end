package com.example.week10_jdbc.controller;

import com.example.week10_jdbc.entity.PostEntity;
import com.example.week10_jdbc.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/week10/post")
public class PostController {

    public final PostService service;

    @Autowired
    public PostController(PostService service) {
        this.service = service;
    }
    @GetMapping
    public List<PostEntity> get(){
        return this.service.get();
    }


    @PostMapping
    public void createPost(@RequestBody PostEntity entity) {
        service.create(entity);
    }


}
