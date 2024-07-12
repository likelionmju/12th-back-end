package com.example.aop.aspect;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/context")
    @LogExecutionTime
    public String context() {
        return "hello";
    }

    @GetMapping("/aop")
    @LogExecutionTime
    public String aop() {
        return "aop";
    }

}
