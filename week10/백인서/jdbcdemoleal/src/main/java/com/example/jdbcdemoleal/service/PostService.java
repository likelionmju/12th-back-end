package com.example.jdbcdemoleal.service;
import com.example.jdbcdemoleal.entity.Post;
import com.example.jdbcdemoleal.repository.PostRepository;
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
}
