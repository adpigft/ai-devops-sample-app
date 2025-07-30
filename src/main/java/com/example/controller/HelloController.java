package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.HelloResponse;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public HelloResponse sayHello() {
        return new HelloResponse("Hello, DevOps AI!");
    }
}