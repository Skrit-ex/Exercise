package com.example.lesson49springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/reg")
    public String reg(Model model){
        model.addAttribute("newUser", new User());
        return "index";
    }

    @PostMapping("/reg")
    public String reg(@ModelAttribute("newUser") User user){
        userRepository.save(user);
        return "redirect:/";

    }

    @GetMapping("/auth")
    public String auth(){
        return "index";
    }
    @PostMapping("/auth")
    public String auth(User user){
        return "index";
    }
}
