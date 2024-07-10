package hello.hello_Spring.repository;
import hello.hello_Spring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface SpringDataJpaMemberRepository extends JpaRepository<Member,
    Long>, MemberRepository {
  Optional<Member> findByName(String name);
}
