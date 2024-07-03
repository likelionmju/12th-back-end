@Controller
public class MemberController {
  private MemberService memberService;
  @Autowired
  public MemberController(MemberService memberService) {
    this.memberService = memberService;
  }

  @GetMapping("/members/new")
  public String createFrom(){
    return "members/createMemberForm";
  }

  @PostMapping(value = "/members/new")
  public String create(MemberForm form) {
    Member member = new Member();
    member.setName(form.getName());
    memberService.join(member);
    return "redirect:/";
  }

  @GetMapping(value = "/members")
  public String list(Model model) {
    List<Member> members = memberService.findMembers();
    model.addAttribute("members", members);
    return "members/memberList";
  }
}