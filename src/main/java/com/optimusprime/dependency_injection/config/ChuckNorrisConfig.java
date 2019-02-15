package com.optimusprime.dependency_injection.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckNorrisConfig {

    @Bean
    public ChuckNorrisQuotes getCheckNorrisBean(){
        return new ChuckNorrisQuotes();
    }
}
