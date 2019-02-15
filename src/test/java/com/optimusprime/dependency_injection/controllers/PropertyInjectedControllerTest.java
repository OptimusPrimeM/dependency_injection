package com.optimusprime.dependency_injection.controllers;

import com.optimusprime.component_scan.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController  =  new PropertyInjectedController();
        this.propertyInjectedController.greetingService =  new GreetingServiceImpl();
    }

    @Test
    public void sayHello() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_FROM_PROPERTY_BASED, propertyInjectedController.sayHello());
    }

}