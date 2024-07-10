public interface MemberRepository {
  Member save(Member member);
  Optional<Member> findById(long id);
  Optional<Member> findByName(String name);
  List<Member> findAll();
}