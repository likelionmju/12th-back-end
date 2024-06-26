package hello.hello_Spring.service;

import hello.hello_Spring.repository.JdbcMemberRepository;
import hello.hello_Spring.repository.JpaMemberRepository;
import hello.hello_Spring.repository.MemberRepository;
import hello.hello_Spring.repository.MemoryMemberRepository;
import jakarta.persistence.EntityManager;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
  private final MemberRepository memberRepository;
  public SpringConfig(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }
  @Bean
  public MemberService memberService() {
    return new MemberService(memberRepository);
  }
}