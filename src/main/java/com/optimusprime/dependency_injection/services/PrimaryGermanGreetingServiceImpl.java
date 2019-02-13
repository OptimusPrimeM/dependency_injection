package com.optimusprime.dependency_injection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ge")
@Primary
public class PrimaryGermanGreetingServiceImpl implements  GreetingService {

    @Override
    public String sayGreeting() {
        return "Hallo von der Hauptbohne!";
    }
}
