import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberService {
  private final MemberRepository memberRepository;
  @Autowired
  public MemberService(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }
}
