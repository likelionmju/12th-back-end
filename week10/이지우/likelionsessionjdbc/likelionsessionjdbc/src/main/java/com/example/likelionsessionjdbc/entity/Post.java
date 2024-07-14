package com.example.likelionsessionjdbc.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {

    private Long id;
    private String title;
    private String content;

    public Post(long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Post() {
    }
}
