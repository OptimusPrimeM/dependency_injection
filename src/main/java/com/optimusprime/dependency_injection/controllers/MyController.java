package com.optimusprime.dependency_injection.controllers;

import com.optimusprime.dependency_injection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
         return greetingService.sayGreeting();
     }
}
