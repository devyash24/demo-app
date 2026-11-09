package com.demo.demo_app;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet(String name) {
        if (name == null || name.isBlank()) return "Hello, stranger!";
        return "Hello, " + name.trim() + "!";
    }
}