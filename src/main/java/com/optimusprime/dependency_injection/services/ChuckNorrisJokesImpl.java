package com.optimusprime.dependency_injection.services;

import com.optimusprime.dependency_injection.config.ChuckNorrisConfig;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesImpl implements ChuckNorrisJokes {

    private ChuckNorrisConfig chuckNorrisConfig;

    public ChuckNorrisJokesImpl(ChuckNorrisConfig chuckNorrisConfig) {
        this.chuckNorrisConfig = chuckNorrisConfig;
    }

    @Override
    public String getRandomQuote() {
        System.out.println("sasasasasssssssssssss");

        String joke = chuckNorrisConfig.getCheckNorrisBean().getRandomQuote();
        return joke;
    }
}
