package hello.helloSpring.controller;

import hello.helloSpring.aspect.LogExecutionTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @LogExecutionTime
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
