package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Spring MVC";
    }
}