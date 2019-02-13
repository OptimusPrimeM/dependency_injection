package com.optimusprime.dependency_injection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingServiceImpl implements  GreetingService{


    @Override
    public String sayGreeting() {
        return "This is spanish greeting service!";
    }
}
