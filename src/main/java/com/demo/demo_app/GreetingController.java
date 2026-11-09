package com.demo.demo_app;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    private final GreetingService service;

    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(required = false) String name) {
        return service.greet(name);
    }
}