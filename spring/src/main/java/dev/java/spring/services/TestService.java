package dev.java.spring.services;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public String getTest() {
        return "Hello world";
    }
}
