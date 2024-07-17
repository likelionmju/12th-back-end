package com.example.week11.service;

import com.example.week11.entity.Post;
import com.example.week11.repository.PostRepository;
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

    public Post createPost(Post post) {
        return this.postRepository.save(post);
    }

    public Post updatePost(Post post) {
        Optional<Post> existingPost = this.postRepository.findById(post.getId());
        if (existingPost.isPresent()) {
            Post updatedPost = existingPost.get();
            updatedPost.setTitle(post.getTitle());
            updatedPost.setContent(post.getContent());
            return postRepository.save(updatedPost);

        }
        else {
            throw new RuntimeException("해당 ID의 Post가 없습니다. " + post.getId());
        }
    }

    public void deletePost(Long id) {
        if (postRepository.existsById(id)) {
            postRepository.deleteById(id);
        }
        else {
            throw new RuntimeException("해당 ID의 Post가 없습니다. " + id);
        }
    }

    public List<Post> searchPosts(String keyword) {
        return postRepository.findByTitleContainingOrContentContaining(keyword, keyword);
    }
}