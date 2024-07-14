package com.example.demo2.service;

import com.example.demo2.entity.Post;
import com.example.demo2.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return this.postRepository.findAll();
    }

    public void createPost(Post post) {
        this.postRepository.save(post);
    }

    public Post updatePost(Post post) {
        Optional<Post> existingPost = postRepository.findById(post.getId());
        if(existingPost.isPresent()){
            Post updatePost = existingPost.get();
            updatePost.setTitle(post.getTitle());
            updatePost.setContent(post.getContent());

            return postRepository.save(updatePost);
        }
        else {
            throw new RuntimeException("해당 ID의 Post가 없습니다. " + post.getId());
        }
    }

    public void deletePost(Long id) {
        if(postRepository.existsById(id)){
            postRepository.deleteById(id);
        } else{
            throw new RuntimeException("해당 ID의 Post가 없습니다. " + id);
        }
    }

    public Optional<Post> getById(Long id) {
        if(postRepository.existsById(id)){
           return postRepository.findById(id);
        }else {
            throw new RuntimeException("해당 ID의 Post가 없습니다. " + id);
        }
    }
}
