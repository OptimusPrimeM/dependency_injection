package com.optimusprime.dependency_injection.services;

import com.optimusprime.dependency_injection.config.ChuckNorrisConfig;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesImpl implements ChuckNorrisJokes {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokesImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomQuote() {
        String joke = chuckNorrisQuotes.getRandomQuote();
        return joke;
    }
}
