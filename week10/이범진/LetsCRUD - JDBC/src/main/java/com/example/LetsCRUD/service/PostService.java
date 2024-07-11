package com.example.LetsCRUD.service;

import com.example.LetsCRUD.entity.Post;
import com.example.LetsCRUD.repository.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostDao postDao;

    @Autowired
    public PostService(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> retrieveAllPosts() {
        return this.postDao.findAll();
    }

    public void createPost(Post post) {
        this.postDao.save(post);
    }
}
