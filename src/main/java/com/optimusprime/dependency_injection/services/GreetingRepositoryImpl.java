package com.optimusprime.dependency_injection.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingRepositoryImpl implements  GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Primary Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola de frijol primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo von der Hauptbohne!";
    }
}
