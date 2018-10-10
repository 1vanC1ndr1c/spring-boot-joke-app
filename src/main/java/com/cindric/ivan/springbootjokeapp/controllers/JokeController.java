package com.cindric.ivan.springbootjokeapp.controllers;


import com.cindric.ivan.springbootjokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
                            //because of this 'joke' underneath, the html template
                            //knows what to insert in the place of {joke}
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";//show us the view for chucknorris
    }

}
