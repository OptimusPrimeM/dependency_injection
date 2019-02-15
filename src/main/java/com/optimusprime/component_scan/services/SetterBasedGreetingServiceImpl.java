package com.optimusprime.component_scan.services;

import org.springframework.stereotype.Service;

@Service
public class SetterBasedGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "I injected by SetterBase";
    }
}
