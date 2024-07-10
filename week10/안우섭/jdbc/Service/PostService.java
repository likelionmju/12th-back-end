package com.example.jdbc.Service;

import com.example.jdbc.Entity.Post;
import com.example.jdbc.Repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

  private final PostRepository postRepository;

  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public List<Post> getAllPosts() {
    return postRepository.findAll();
  }

  public void createPost(Post post) {
    postRepository.save(post);
  }

  public void updatePost(Long id, Post post) {
    postRepository.update(id, post);
  }

  public void deletePost(Long id) {
    postRepository.delete(id);
  }
}
