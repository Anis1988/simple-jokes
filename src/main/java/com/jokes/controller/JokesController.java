package com.jokes.controller;

import com.jokes.service.Jokes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private final Jokes jokes;
    
    @Autowired
    public JokesController(Jokes jokes) {
        this.jokes = jokes;
    }

    @GetMapping("/")
    public String getrandjokes(Model model) {
        model.addAttribute("joke",jokes.getJokes());
        return "chuck";

    }

}
