public interface SpringDataJpaMemberRepository extends JpaRepository<Member,
    Long>, MemberRepository {
  Optional<Member> findByName(String name);
}