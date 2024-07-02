package com.example.demo.domain;

public class Member {
    // 고객이 정하는 id가 아닌 시스템에서 쓸 id임
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
