package com.example.week10_jdbc.service;

import com.example.week10_jdbc.entity.PostEntity;
import com.example.week10_jdbc.repository.JdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final JdbcRepository repository;

    @Autowired
    public PostService(JdbcRepository repository) {
        this.repository = repository;
    }


    public List<PostEntity> get(){
        return this.repository.findAll();
    }

    public void create(PostEntity post) {
        this.repository.save(post);
    }



}
