package com.example.likelionsession.service;

import com.example.likelionsession.entity.Post;
import com.example.likelionsession.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    public void deletePostById(Long postId){
        postRepository.deleteById(postId);
    }

    public void updatePost(Long id,Post post){
        Optional<Post> optionalPost = this.postRepository.findById(id);
        if(optionalPost.isEmpty()){
            System.out.println("Post not found");
        }
        else {
            Post existingPost = optionalPost.get();
            existingPost.setTitle(post.getTitle());
            existingPost.setContent(post.getContent());
            this.postRepository.save(existingPost);
        }

    }
}
