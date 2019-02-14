package com.optimusprime.dependency_injection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifeCycleDemonstration implements InitializingBean,DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {


    public BeanLifeCycleDemonstration() {
        System.out.println("In the BeanLifeCycleDemonstration bean constructor");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is "+ name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory has been set.");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context has been set.");
    }

    public void beforeInit(){
        System.out.println("Before Init called by Bean Post Processor");
    }


    @PostConstruct
    public void postConstruct(){
        System.out.println("The post construct annotated method has been called!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("The BeanLifeCycleDemonstration has its property set");
    }


    public void afterInit(){
        System.out.println("After Init called by Bean Post Processor");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("The pre destroy annotated method has been called!");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("The BeanLifeCycleDemonstration has been terminated!");
    }











}
