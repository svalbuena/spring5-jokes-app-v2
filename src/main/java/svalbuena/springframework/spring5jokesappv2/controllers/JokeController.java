package svalbuena.springframework.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import svalbuena.springframework.spring5jokesappv2.services.JokeService;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(final JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"", "/"})
    public String showJoke(final Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "jokes/index";
    }
}
