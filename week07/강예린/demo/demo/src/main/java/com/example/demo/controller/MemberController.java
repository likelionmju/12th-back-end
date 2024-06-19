package com.example.demo.controller;

import com.example.demo.domain.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {
    private final MemberService memberservice;
    //생성자로 주입하는 방법
    @Autowired
    public MemberController(MemberService memberservice) {
        this.memberservice = memberservice;
    }
    // Getmapping은 url 창에 치면 요거 호출- 조회할때 사용
    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";
        }

    // 데이터를 폼에서 받을때 사용
        @PostMapping("/members/new")
    public String create(MemberForm form){
            Member member= new Member();
            member.setName(form.getName());
            memberservice.join(member);

            //회원가입이 끝났으니 홈화면으로 보내기
            return "redirect:/";
        }

        @GetMapping("/members")
    public String list(Model model){
        List<Member> members= memberservice.findMembers();
        model.addAttribute("members", members);
        return  "members/memberList";
        }
    // 필드 주입
    /*@Autowired
    private MemberService memberservice;*/

    // setter 이용
    /*@Autowired
    public void setMemberservice(MemberService memberservice){
        this.memberservice= memberservice;
    }*/
}
