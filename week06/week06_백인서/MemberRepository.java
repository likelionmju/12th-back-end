package com.springSession.repository;

import com.springSession.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findByName(String name);
    List<Member> findAll();
    Optional<Member> findById(Long id);
}
