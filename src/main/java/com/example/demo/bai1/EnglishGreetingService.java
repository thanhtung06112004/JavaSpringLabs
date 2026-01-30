package com.example.demo.bai1;

import org.springframework.stereotype.Component;

@Component
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Spring MVC";
    }
}