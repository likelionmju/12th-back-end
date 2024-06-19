package com.example.demo.domain;

public class Member {
  private Long id;         // 회원의 고유 식별자
  private String name;     // 회원의 이름

  // id 값을 반환하는 메서드
  public Long getId() {
    return id;
  }

  // id 값을 설정하는 메서드
  public void setId(Long id) {
    this.id = id;
  }

  // name 값을 반환하는 메서드
  public String getName() {
    return name;
  }

  // name 값을 설정하는 메서드
  public void setName(String name) {
    this.name = name;
  }
}
