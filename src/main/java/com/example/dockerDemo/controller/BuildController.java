package com.example.dockerDemo.controller;

import com.example.dockerDemo.repository.BuildStatRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuildStatController {

    private final BuildStatRepository repo;

    public BuildStatController(BuildStatRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String showStats(Model model) {
        model.addAttribute("stats", repo.findAll());
        model.addAttribute("successCount", repo.countSuccess());
        model.addAttribute("failureCount", repo.countFailure());
        return "stats";
    }
}

