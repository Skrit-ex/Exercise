package by.tms.controller;

import by.tms.Operation;
import by.tms.User;
import by.tms.service.OperationService;
import by.tms.service.UserService;
import by.tms.storage.UserStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@ComponentScan
@RequestMapping("/user")
public class UserController {
    private final UserStorage userStorage = UserStorage.getInstance();

    @Autowired
    private OperationService operationService;

    @GetMapping("/reg")
    public String reg(Model model){
        model.addAttribute("newUser", new User());
        return "reg";
    }
    @PostMapping("reg")
    public String reg(@ModelAttribute("newUser") @Valid User user, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        for(FieldError fieldError : fieldErrors){
            model.addAttribute(fieldError.getField(), fieldError.getDefaultMessage());
        }
        model.addAttribute("newUser", user);
            return "reg";
        }
        userStorage.save(user);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("login")
    public String login(@Validated User user, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "login";
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
