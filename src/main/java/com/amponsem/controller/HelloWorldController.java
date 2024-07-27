package com.amponsem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    //return a statement
    @GetMapping("/test1")
    @ResponseBody
    public String helloWorld() {
        return "Welcome to 2024 Olympics Games";
    }

    @GetMapping("/test2")
    //the response body is for pure text
    public String showPage(Model model) {
        model.addAttribute("message", "Welcome to 2024 Olympics Games");
        return "helloPage";
    }
}
