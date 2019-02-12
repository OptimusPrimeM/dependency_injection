package com.optimusprime.dependency_injection.controllers;

import com.optimusprime.dependency_injection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
       return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
