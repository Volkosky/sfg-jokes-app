package com.volkosky.sfgjokesapp.controllers;

import com.volkosky.sfgjokesapp.services.JokesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokesServiceImpl jokesService;

    public JokesController(JokesServiceImpl jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model) {
        System.out.println("here");
        model.addAttribute("joke", jokesService.getJoke());
        return "chucknorris";
    }
}
