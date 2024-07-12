package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {
    // 고객이 정하는 id가 아닌 시스템에서 쓸 id임
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // pk 지정, DB에서 자동으로 만들어줘서 이렇게 함
    private Long id;

    private String name;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
