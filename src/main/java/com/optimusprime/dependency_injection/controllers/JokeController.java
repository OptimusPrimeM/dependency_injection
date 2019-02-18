package com.optimusprime.dependency_injection.controllers;

import com.optimusprime.dependency_injection.services.ChuckNorrisJokes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private ChuckNorrisJokes chuckNorrisJokes;

    public JokeController(ChuckNorrisJokes chuckNorrisJokes) {
        this.chuckNorrisJokes = chuckNorrisJokes;
    }

    @RequestMapping("/joke")
    public String getJoke(Model model){

        model.addAttribute("joke",  chuckNorrisJokes.getRandomQuote());
        return "chucknorris";

    }
}
