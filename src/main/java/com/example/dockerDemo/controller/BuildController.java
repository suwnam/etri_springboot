package com.example.dockerDemo.controller;

import com.example.dockerDemo.entity.BuildResult;
import com.example.dockerDemo.repository.BuildResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BuildController {

    @Autowired
    private BuildResultRepository repository;

    @GetMapping("/stats")
    public String showBuildResults(Model model) {
        List<BuildResult> results = repository.findAll();
        model.addAttribute("builds", results);
        return "builds";  // templates/builds.html 렌더링
    }
}

