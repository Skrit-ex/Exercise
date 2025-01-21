package com.example.controller;

import com.example.dto.LoginDto;
import com.example.dto.RegUserDto;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
@RequestMapping("/")
public class RegController {

    private final Logger log = Logger.getLogger(UserService.class.getName());
    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("newRegUser", new RegUserDto());
        model.addAttribute("newLogin", new LoginDto());
        return "home";
    }

    @GetMapping("/reg")
    public String reg(Model model) {
        model.addAttribute("newRegUser", new RegUserDto());
        model.addAttribute("newLogin", new LoginDto());
        return "reg";
    }

    @PostMapping("/reg")
    public String reg(@ModelAttribute("newRegUser") RegUserDto regUserDto,
                      @ModelAttribute("newLogin") LoginDto loginDto,
                      BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) return "reg";

        if (userService.save(regUserDto)) {
            return "redirect:/reg";
        }
        userService.save(regUserDto);
        return "login";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("newLogin", new LoginDto());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("newLogin") @Validated LoginDto loginDto,
                        BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "login";
        }
        return "redirect:/";
    }
}
