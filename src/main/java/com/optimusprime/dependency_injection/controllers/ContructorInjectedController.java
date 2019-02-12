package com.optimusprime.dependency_injection.controllers;

import com.optimusprime.dependency_injection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ContructorInjectedController {

    private GreetingService greetingService;

    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello (){
        return greetingService.sayGreeting();
    }
}
