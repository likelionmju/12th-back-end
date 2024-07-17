package com.example.demo.controller;

import com.example.demo.entity.Post;
import com.example.demo.service.Service;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class Controller {
    @Autowired
    private Service service;

    @Operation(summary = "게시물 조회", description = "게시물을 조회합니다.")
    @GetMapping
    public List<Post> getAllPost() {
        return this.service.getAllPost();
    }

    @Operation(summary = "ID로 게시물 조회", description = "해당 ID의 게시물을 조회합니다.")
    @GetMapping("/{id}")
    public Optional<Post> getPostById(@PathVariable Long id) {
        return service.getPostById(id);
    }

    @Operation(summary = "게시물 생성", description = "게시물을 생성합니다.")
    @PostMapping
    public void createPost(@RequestBody Post post) {
        service.createPost(post);
    }

    @Operation(summary = "게시물 수정", description = "ID를 기준으로 원하는 컬럼을 수정합니다.")
    @PutMapping
    public Post updatePost(@RequestBody Post post) {
        return service.updatePost(post);
    }

    @Operation(summary = "게시물 삭제", description = "ID를 이용해 원하는 게시글을 삭제합니다.")
    @DeleteMapping("{id}")
    public void deletePost(@PathVariable Long id) {
        this.service.deletePost(id);
    }

    @Operation(summary = "게시물 부분 수정", description = "ID를 이용해 원하는 게시글을 부분 수정합니다.")
    @PatchMapping("{id}")
    public ResponseEntity<Long> partialUpdatePost(@PathVariable Long id, @RequestBody Post post) {
        Long updatedPostId = this.service.patchPost(id, post);
        return ResponseEntity.ok(updatedPostId);
    }
}


