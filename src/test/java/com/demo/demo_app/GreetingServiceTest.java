package com.demo.demo_app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceTest {
    private final GreetingService service = new GreetingService();

    @Test
    void greetsByName() {
        assertEquals("Hello, Yadnyesh!", service.greet("Yadnyesh"));
    }

    @Test
    void handlesBlankName() {
        assertEquals("Hello, stranger!", service.greet("  "));
    }
}