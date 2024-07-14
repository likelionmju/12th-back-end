package com.example.week10.service;

import com.example.week10.entity.PostEntity;
import com.example.week10.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    public List<PostEntity> get(){
        return this.repository.findAll();
    }

    public void create(PostEntity post) {
        this.repository.save(post);
    }

    public Optional<PostEntity> getById(Long id) {
        if(this.repository.existsById(id)){
            return this.repository.findById(id);
        }else{
            throw new RuntimeException("해당 ID의 Post가 없습니다." + id);
        }
    }

    public PostEntity update(PostEntity post) {
        //isPresent 아니면 existsById
        if (repository.existsById(post.getId())) {
            return this.repository.save(post);
        } else {
            throw new RuntimeException("ID:" + post.getId()+"존재하지 않습ㅂ니다.");
        }
    }

    public void delete(Long id) {
        if (repository.existsById(id)) {
            this.repository.deleteById(id);

        } else {
            throw new RuntimeException("ID:" + id+ "존재하지 않습ㅂ니다.");
        }
    }

}
