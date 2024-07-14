package com.example.demo.service;

import com.example.demo.entity.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return this.postRepository.findAll(); // 함수를 안만들어도 함수가 많이 뜨는이유가 레포 인터페이스에서jpa를 상속 받았기 때문
    }

    public void createPost(Post post) {
        this.postRepository.save(post);
    }

    public void updatePost(Long id, Post post) {
        Optional<Post> postTemp = postRepository.findById(id);
        if (postTemp.isEmpty()) {
            throw new IllegalStateException("게시물이 존재하지 않습니다.");
        }
        Post oldPost = postTemp.get();
        oldPost.setTitle(post.getTitle());
        oldPost.setContent(post.getContent());
        postRepository.save(oldPost);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
