package com.optimusprime.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements  GreetingService {

    public static final String HELLO_FROM_PROPERTY_BASED = "I injected by property based!";

    @Override
    public String sayGreeting() {
        return HELLO_FROM_PROPERTY_BASED;
    }
}
