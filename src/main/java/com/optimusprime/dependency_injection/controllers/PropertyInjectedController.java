package com.optimusprime.dependency_injection.controllers;

import com.optimusprime.dependency_injection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello (){
       return greetingService.sayGreeting();
    }


}
