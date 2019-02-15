package com.optimusprime.dependency_injection;

import com.optimusprime.dependency_injection.controllers.ConstructorInjectedController;
import com.optimusprime.dependency_injection.controllers.MyController;
import com.optimusprime.dependency_injection.controllers.PropertyInjectedController;
import com.optimusprime.dependency_injection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.optimusprime.component_scan.services.","com.optimusprime.dependency_injection"})
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);
//		MyController myController = (MyController) applicationContext.getBean("myController");
//		myController.hello();

        System.out.println("Property based = "+applicationContext.getBean(PropertyInjectedController.class).sayHello());
        System.out.println("Setter based = "+applicationContext.getBean(SetterInjectedController.class).sayHello());
        System.out.println("Constructor based = "+applicationContext.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println("Primary bean = "+applicationContext.getBean(MyController.class).hello());
	}

}

