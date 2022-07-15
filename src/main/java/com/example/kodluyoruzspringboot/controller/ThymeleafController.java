package com.example.kodluyoruzspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ThymeleafController {

    // http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1") //url yapısı
    //@ResponseBody
    public String getThymeleaf1(Model model){
        model.addAttribute("key_model1","Ben modelden geldim-1");
        model.addAttribute("key_model2","Ben modelden geldim-2");
        return "thymeleaf1";
    }

    // http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2") //url yapısı
    //@ResponseBody
    public String getThymeleaf2(Model model){
        model.addAttribute("key_model1","Ben modelden geldim-1");
        model.addAttribute("key_model2","Ben modelden geldim-2");
        return "/thymeleaf2";
    }
}
