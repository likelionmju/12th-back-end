package com.example.jpa.Service;

import com.example.jpa.Entity.Post;
import com.example.jpa.Repository.PostRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
  @Autowired
  private PostRepository postRepository;

  public List<Post> getAllPosts(){
    return postRepository.findAll();
  }


  public void createPost(Post post) {
    this.postRepository.save(post);

  }
  // Update 메서드
  public void updatePost(Long id, Post postDetails) {
    Optional<Post> optionalPost = postRepository.findById(id);
    if (optionalPost.isPresent()) { // 이미존재하면
      Post post = optionalPost.get(); // 그 post 가져와서 내용 수정
      post.setTitle(postDetails.getTitle());
      post.setContent(postDetails.getContent());
      postRepository.save(post); // 저장
    }
  }

  // Delete 메서드
  public void deletePost(Long id) {
    postRepository.deleteById(id); // id가 pk여서, id 지우면 관련 내용 delete
  }
}