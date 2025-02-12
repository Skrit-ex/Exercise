package com.example.controller;

import com.example.dto.LoginDto;
import com.example.dto.RegUserDto;
import com.example.entity.User;
import com.example.repository.BookRepository;
import com.example.service.BookService;
import com.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/")
public class RegController {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("newRegUser", new RegUserDto());
        model.addAttribute("newLogin", new LoginDto());
        if(bookService.isDataEmpty()){
            bookService.addListOfBooks();
            log.error("BaseDate is empty, file will added");
            return "home";
        }else {
            log.error("DataFiles exist");
        }
            return "home";
    }

    @GetMapping("/reg")
    public String reg(Model model) {
        model.addAttribute("newRegUser", new RegUserDto());
        model.addAttribute("newLogin", new LoginDto());
        return "home";
    }

    @PostMapping("/reg")
    public String reg(@ModelAttribute("newRegUser") RegUserDto regUserDto,
                      @ModelAttribute("newLogin") LoginDto loginDto,
                      BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) return "reg";

        if (userService.save(regUserDto)) {
            return "home";
        }
        userService.save(regUserDto);
        return "home";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("newLogin", new LoginDto());
        model.addAttribute("newRegUser", new RegUserDto());
        return "home";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("newLogin") @Validated LoginDto loginDto,
                        @ModelAttribute("newRegUser") @Validated RegUserDto regUserDto,
                        BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            log.error("error in loginMapping");
            return "home";
        }

//        Optional<User> opUser = userService.findByEmail(loginDto.getEmail());
//        if(opUser.isPresent() && userService.findByPassword(loginDto.getPassword());

        Optional<User> email = userService.findByEmail(regUserDto.getEmail());
        if(email.isPresent()){
            log.info("email found and save CurrentUser");
        }else {
            model.addAttribute("errorEmail", true);
            log.error("email not found or not exist");
        }
        Optional<User> password = userService.findByPassword(regUserDto.getPassword());
        if (password.isPresent()){
            log.info("ok password");
        }else {
            model.addAttribute("errorPassword", true);
            log.error("password wrong or not found");
        }

        return "home";
    }
}
