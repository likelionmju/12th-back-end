package com.example.week11.controller;

import com.example.week11.entity.Post;
import com.example.week11.service.PostService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    @Operation(summary = "게시물 조회", description = "전체 게시물을 조회합니다.")
    public List<Post> getAllPosts() {
        return this.postService.getAllPosts();
    }

    @PostMapping
    @Operation(summary = "게시물 생성", description = "게시물을 생성합니다.")
    public Post createPost(@RequestBody Post post) {
        return this.postService.createPost(post);
    }

    @PutMapping
    @Operation(summary = "게시물 수정", description = "게시물을 수정합니다.")
    public Post updatePost(@RequestBody Post post) {
        return postService.updatePost(post);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "게시물 삭제", description = "ID를 통해 게시물을 삭제합니다.")
    public void deletePost(@RequestBody Long id) {
        this.postService.deletePost(id);
    }

    @GetMapping("/search")
    @Operation(summary = "게시물 검색", description = "Keyword를 통해 게시물을 검색합니다.")
    public List<Post> searchPosts(@RequestParam String keyword) {
        return this.postService.searchPosts(keyword);
    }
}
