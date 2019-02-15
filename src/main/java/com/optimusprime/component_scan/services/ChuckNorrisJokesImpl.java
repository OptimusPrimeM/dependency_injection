package com.optimusprime.component_scan.services;

import com.optimusprime.dependency_injection.config.ChuckNorrisConfig;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesImpl implements ChuckNorrisJokes {

    private ChuckNorrisConfig chuckNorrisConfig;

    public ChuckNorrisJokesImpl(ChuckNorrisConfig chuckNorrisConfig) {
        this.chuckNorrisConfig = chuckNorrisConfig;
    }

    @Override
    public String getRandomQuote() {
        String joke = chuckNorrisConfig.getCheckNorrisBean().getRandomQuote();
        return joke;
    }
}
