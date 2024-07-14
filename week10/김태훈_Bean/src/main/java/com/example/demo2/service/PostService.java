package com.example.demo2.service;

import com.example.demo2.entity.PostDTO;
import com.example.demo2.repository.PostDAO;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class PostService {
    private final PostDAO postDAO;

    public PostService(PostDAO postDAO) {
        this.postDAO = postDAO;
    }

    public PostDTO getPostById(Long id) throws SQLException {
        return postDAO.findById(id);
    }

    public void savePost(PostDTO post) throws SQLException {
        postDAO.save(post);
    }
}
