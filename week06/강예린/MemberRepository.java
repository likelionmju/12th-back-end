package com.example.demo.repository;

import com.example.demo.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    // 멤버를 저장하고 멤버 반환
    Member save(Member member);
    // null일 때 Optional로 감싸서 반환
    // 각각 id로 name으로 멤버 찾기
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    // 지금까지 저장된 모든 회원들 리스트로 반환ㄴ
   List<Member> findAll();}
