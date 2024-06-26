package com.example.hello_spring.repository;

import com.example.hello_spring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{
    //command + n : Generate
    private static Map<Long, Member> store = new HashMap<>();

    private static long sequence = 0L;
    // 회원 아이디를 만들기 위한 메소드

    public MemoryMemberRepository() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    public void clearStore() {
        store.clear();
    }

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member ->  member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }
}