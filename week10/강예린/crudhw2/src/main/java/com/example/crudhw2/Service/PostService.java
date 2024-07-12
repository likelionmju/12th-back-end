package com.example.crudhw2.Service;


import com.example.crudhw2.Entity.Post;
import com.example.crudhw2.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    public List<Post> getAllPosts(){
        return this.postRepository.findAll();
    }

    public void createPost(Post post) {
        this.postRepository.save(post);
    }

    public void updatePost(Post post){
        Optional<Post> temp= this.postRepository.findById(post.getId());
        if(temp.isPresent()){
            Post tempPost= temp.get();
            tempPost.setTitle(post.getTitle());
            tempPost.setContent(post.getContent());
            this.postRepository.save(post);
        }
    }

    public void deletePost(Post post){
        this.postRepository.delete(post);
    }
}
