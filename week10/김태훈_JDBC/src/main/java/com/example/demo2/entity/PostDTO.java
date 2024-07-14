package com.example.demo2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// 변경된 Post DTO 클래스
public class PostDTO {
    private Long id;
    private String title;
    private String content;

    public void setId(long id) {
    }

    public void setTitle(String title) {
    }

    public void setContent(String content) {
    }

    public String getTitle() {
        return null;
    }

    public String getContent() {
        return null;
    }

    // getters and setters
}
