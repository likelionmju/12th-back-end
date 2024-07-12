package com.example.jdbccrud.service;

import com.example.jdbccrud.entity.Post;
import com.example.jdbccrud.repository.PostRepository;

import java.util.List;

public class PostService {

    private PostRepository postRepository;

    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post updatePost(Post post) {
        if(postRepository.findById(post.getId()) != null)
            return postRepository.update(post);
        else
            return null;
    }

    public Long deletePost(Post post) {
        if(postRepository.findById(post.getId()) != null)
            return postRepository.delete(post.getId());
        else
            return null;
    }
}
