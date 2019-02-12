package com.optimusprime.dependency_injection.controllers;

import com.optimusprime.dependency_injection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello (){
        return greetingService.sayGreeting();
    }
}
