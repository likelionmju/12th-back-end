package com.example.jdbc.Controller;
//import org.springframework.beans.factory.annotation.Autowired;

import com.example.jdbc.Entity.Post;
import com.example.jdbc.Service.PostService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")

public class likeController {
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

  // Update 메서드
  @PutMapping("/{id}")
  public void updatePost(@PathVariable Long id, @RequestBody Post post){
    this.postService.updatePost(id, post);
  }

  // Delete 메서드
  @DeleteMapping("/{id}")
  public void deletePost(@PathVariable Long id){
    this.postService.deletePost(id);
  }




}
