package com.example.lion0529;

import com.example.lion0529.repository.MemberRepository;
import com.example.lion0529.repository.MemoryMemberRepository;
import com.example.lion0529.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
