package com.example.demo.repository;

import com.example.demo.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
//JpaRepository<Member, Long> 여기서 Long은 pk의 타입
// JpaRepository를 extends 받고 있는 interface라 알아서 bean에 등록해줌
public interface SpringDataJpaMemberRepository  extends JpaRepository<Member, Long>, MemberRepository {

}
