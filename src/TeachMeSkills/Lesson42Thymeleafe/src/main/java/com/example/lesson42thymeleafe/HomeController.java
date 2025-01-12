package com.example.lesson42thymeleafe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class HomeController {



    @GetMapping("/reg")
    String reg (Model model){
        model.addAttribute("newUserReg", new User());
        return "home";
    }

}
