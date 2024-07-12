package com.example.democrud.service;

import com.example.democrud.entity.Post;
import com.example.democrud.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post createSight(Post post) {
        return this.postRepository.save(post);
    }

    public Post updateSight(Post post) {
        if(this.postRepository.existsById(post.getId()))
            return this.postRepository.save(post);
        else
            return null;
    }

    public void deleteSight(Long id) {
        this.postRepository.deleteById(id);
    }

}
