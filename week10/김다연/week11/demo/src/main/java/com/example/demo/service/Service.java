package com.example.demo.service;

import com.example.demo.entity.Post;
import com.example.demo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;

    public List<Post> getAllPost() {
        return this.repository.findAll();
    }

    public void createPost(Post post) {
        this.repository.save(post);
    }

    public Optional<Post> getPostById(Long id) {
        if(this.repository.existsById(id)){
            return this.repository.findById(id);
        }else{
            throw new RuntimeException("해당 ID의 Post가 없습니다." + id);

        }
    }

    public Post updatePost(Post post) {
        Optional<Post> existingPost = repository.findById(post.getId());

        //isPresent 아니면 existsById로도 할 수 있음
        if (existingPost.isPresent()) {
            //만약에 데이터가 존재하면 optional에서 데이터 꺼내기
            Post updatePost = existingPost.get();
            //받아온 entity를 새로운 post로 수정
            updatePost.setTitle(post.getTitle());
            updatePost.setContent(post.getContent());
            updatePost.setWriter(post.getWriter());
            //수정한 entity를 저장 및 반환
            return repository.save(updatePost);
        } else {
            throw new RuntimeException("해당 ID의 Post가 없습니다." + post.getId());
        }
    }

    public void deletePost(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("해당 ID의 Post가 없습니다.");
        }
    }

    public Long patchPost(Long id, Post post) {
        Optional<Post> existingPost = this.repository.findById(id);

        if (existingPost.isPresent()) {
            Post updatePost = existingPost.get();
            if (post.getContent() != null) updatePost.setContent(post.getContent());
            if (post.getWriter() != null) updatePost.setWriter(post.getWriter());
            if (post.getTitle() != null) updatePost.setTitle(post.getTitle());

            repository.save(updatePost);

            return id;
        } else {
            throw new RuntimeException("해당 ID의 Post가 없습니다." + id);
        }
    }


}
