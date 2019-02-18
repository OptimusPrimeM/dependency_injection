package com.optimusprime.dependency_injection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"en","default"})
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Primary Greeting Service";
    }
}
