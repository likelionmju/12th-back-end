package com.example.crudstudy.Controller;

import com.example.crudstudy.Entity.Post;
import com.example.crudstudy.Service.PostService;
import lombok.RequiredArgsConstructor;
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
    public Post createPost(@RequestBody Post post){
        return this.postService.createPost(post);
    }

}
