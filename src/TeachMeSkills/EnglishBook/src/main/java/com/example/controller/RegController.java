package com.example.controller;

import com.example.dto.LoginDto;
import com.example.dto.RegUserDto;
import com.example.entity.SessionUser;
import com.example.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/home")
public class RegController {

    @Autowired
    private UserService userService;

    @GetMapping("/reg")
    public String reg(Model model) {
        model.addAttribute("newRegUser", new RegUserDto());
        return "home";
    }

    @PostMapping("/reg")
    public String reg(@ModelAttribute("newRegUser") @Validated RegUserDto regUserDto,
                      BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "home";
        }

        userService.save(regUserDto);

        return "home";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("newLogin", new LoginDto());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("newLogin") @Validated LoginDto loginDto,
                        BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "login";
        }
        Optional<SessionUser> sessionUser = userService.login(loginDto);
        return "home";
    }
}
