package by.tms.controller;

import by.tms.Operation;
import by.tms.User;
import by.tms.service.OperationService;
import by.tms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@ComponentScan
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private OperationService operationService;

    @GetMapping("/reg")
    public String reg(){
        return "reg";
    }
    @PostMapping("reg")
    public String reg(@Validated User user, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "reg";
        }
        userService.save(user);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(){
        return "reg";
    }

    @PostMapping("login")
    public String login(@Validated User user, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "reg";
        }
        return "redirect:/";
    }

    @GetMapping ("/history")
    public String history(Model model){
        List<Operation> operations = operationService.findAll();
        model.addAttribute("operationHistory", operations);
        return  "history";
    }
}
