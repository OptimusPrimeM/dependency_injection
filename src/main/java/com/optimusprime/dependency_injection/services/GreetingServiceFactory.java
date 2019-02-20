package com.optimusprime.dependency_injection.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }


    public GreetingService createGreetingService(String lang){
        switch (lang){
            case "ge" : return new PrimaryGermanGreetingServiceImpl(greetingRepository);
            case "en"  : return new PrimaryGreetingServiceImpl(greetingRepository);
            case "es"  : return new PrimarySpanishGreetingServiceImpl(greetingRepository);
            default: return new PrimaryGermanGreetingServiceImpl(greetingRepository);
        }
    }

}
