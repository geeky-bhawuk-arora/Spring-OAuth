package com.springlearning.SpringOAuthDemo;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    
    @GetMapping("/hello")
    public String greet() {
        return "Hello Bhawuk!";
    }
}