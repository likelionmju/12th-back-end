package com.example.demo2.controller;

import com.example.demo2.entity.Post;
import com.example.demo2.service.PostService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class likeController {

    private PostService postService;

    @Autowired
    public likeController(PostService postService){this.postService = postService;}

    @Operation(summary = "게시물 조회", description = "전체 게시물을 조회합니다.")
    @GetMapping
    public List<Post> getAllPosts(){
        return this.postService.getAllPosts();
    }
    @Operation(summary = "게시물 조회", description = "ID를 통해 게시물을 조회합니다.")
    @GetMapping( "/{id}")
    public Optional<Post> getById(@PathVariable Long id){
        return this.postService.getById(id);
    }

    @Operation(summary = "게시물 생성", description = "게시물을 생성합니다.")
    @PostMapping
    public void creatPost(@RequestBody Post post) {
        this.postService.createPost(post);
    }

    @Operation(summary = "게시물 수정", description = "게시물을 수정.")
    @PutMapping
    public Post updatePost(@RequestBody Post post) {
        return postService.updatePost(post);
    }

    @Operation(summary = "게시물 삭제", description = "ID를 통해 게시물을 삭제합니다.")
    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id){
        this.postService.deletePost(id);
    }

}
