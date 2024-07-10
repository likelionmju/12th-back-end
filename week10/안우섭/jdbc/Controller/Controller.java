package com.example.jdbc.Controller;

import com.example.jdbc.Entity.Post;
import com.example.jdbc.Service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class Controller {

  private final PostService postService;

  public Controller(PostService postService) {
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

  @PutMapping("/{id}")
  public void updatePost(@PathVariable Long id, @RequestBody Post post) {
    this.postService.updatePost(id, post);
  }

  @DeleteMapping("/{id}")
  public void deletePost(@PathVariable Long id) {
    this.postService.deletePost(id);
  }
}
