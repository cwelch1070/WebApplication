//5
//This class controls what is sent to the index.html page.
//@Autowired is used again here to inject the CattleService interface into this class.
//@GetMapping directs the HTTP request that is created by  the viewHomePage function.
//Model.addAttribute allows Thymeleaf to display the contents of the table to the html page.
package com.javawebapplication.cowcalftracker.controller;

import com.javawebapplication.cowcalftracker.service.CattleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CattleController {

    @Autowired
    private CattleService cattleService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listCattle", cattleService.getAllCattle());
        return "index";
    }
}
