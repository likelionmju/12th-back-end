package com.example.crudhw2.Controller;

import com.example.crudhw2.Entity.Post;
import com.example.crudhw2.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class CrudController {
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

    @PutMapping
    public void updatePost(@RequestBody Post post){
        this.postService.updatePost(post);
   }

    @DeleteMapping
    public void deletePost(@RequestBody Post post){
        this.postService.deletePost(post);
    }
}
