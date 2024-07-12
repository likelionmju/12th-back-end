package com.example.demo.controller;

import com.example.demo.entity.Post;
import com.example.demo.service.PostService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class LikeController {

    // PostService를 주입받음
    @Autowired
    private PostService postService;

    // 모든 게시물을 가져오는 메소드
    @GetMapping
    public List<Post> getAllPosts() {
        return this.postService.getAllPosts();
    }

    // 새로운 게시물을 생성하는 메소드
    @PostMapping
    public void createPost(@RequestBody Post post) {
        this.postService.createPost(post);
    }

    // 게시물을 수정하는 메소드
    @PutMapping("/{id}")
    public void updatePost(@PathVariable Long id, @RequestBody Post post) {
        this.postService.updatePost(id, post);
    }

    // 게시물을 삭제하는 메소드
    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        this.postService.deletePost(id);
    }
}
