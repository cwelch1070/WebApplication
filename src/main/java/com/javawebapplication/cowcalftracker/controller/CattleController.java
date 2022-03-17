package com.javawebapplication.cowcalftracker.controller;

import com.javawebapplication.cowcalftracker.service.CattleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CattleController {

    private CattleService cattleService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listCattle", cattleService.getAllCattle());
        return "index";
    }
}
