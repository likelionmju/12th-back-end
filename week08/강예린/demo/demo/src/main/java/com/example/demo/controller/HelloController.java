package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello") // viewresolver 에게 hello.html넘김 이건 templates에 있어야함
    public String hello(Model model){
        model.addAttribute("data", "hello!");
        return "hello";
    }
    // 파라미터 입력 받아서 name으로 설정하고 model에 키 "name"에 입력 받은 name값- return을 hello-template.html로
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello-template";
    }

    // http의 body부분을 직접 적어주는 것- html 사용하지 않음 string을 반환했기에 그대로 나옴
    @GetMapping("hello-string")
    @ResponseBody //이걸 사용하면 viewresolver 대신 httpmessageconverter 부름
    public String helloString(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello "+ name;
    }
    //객체를 반환했기에 json 방식으로 결과
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi (@RequestParam("name") String name){
        Hello h= new Hello();
        h.setName(name);
        return h;
    }

    // 클래스 안에 static클래스 가능- 이렇게 하면 외부클래스.내부클래스 이렇게 접근
    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

