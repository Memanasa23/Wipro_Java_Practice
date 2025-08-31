package com.example.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/hello")
    public String hello() {
        return "Hello World!!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Hello from Greet";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin Page - Jaiswal Memanasa";
    }
}
