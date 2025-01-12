package com.example.controller;

import com.example.dto.LoginDto;
import com.example.dto.RegUserDto;
import com.example.entity.SessionUser;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/home")
public class RegController {

    @Autowired
    private UserService userService;

    @GetMapping("/reg")
    public String reg (Model model){
        model.addAttribute("newRegUser", new RegUserDto());
        return "home";
    }

    @PostMapping("/reg")
    public String reg(Model model, BindingResult bindingResult,
                      @ModelAttribute("newRegUser") @Valid RegUserDto regUserDto){
        if(bindingResult.hasErrors()){
            return "home";}
        try{
            userService.save(regUserDto);
        }
        catch (ConstraintViolationException e){
            model.addAttribute("regError", "User with this username is already exist");
            return "home";
        }
        return "home";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("newLogin", new  LoginDto());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("newLogin") @Valid LoginDto loginDto,
                        BindingResult bindingResult, Model model,
                        HttpSession httpSession){
        if(bindingResult.hasErrors()) {
            return "login";
        }
                Optional<SessionUser> sessionUser = userService.login(loginDto);
                if(sessionUser.isPresent()){
                httpSession.setAttribute("userSession", sessionUser.get());
                return "/";
                }
                else {
                    model.addAttribute("loginError", "Login  or password is wrong, try again");
                    return "login";
                }
    }
}
