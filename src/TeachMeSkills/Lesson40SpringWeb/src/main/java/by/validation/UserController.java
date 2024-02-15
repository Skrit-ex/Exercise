package by.validation;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/reg")
    public String reg(Model model) {
        model.addAttribute("newUser", new User());
        return "reg";
    }

    @PostMapping("reg")
    public String reg(@ModelAttribute("newUser") @Validated User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
//            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
//            for (FieldError fieldError : fieldErrors) {
//                model.addAttribute(fieldError.getField(), fieldError.getDefaultMessage());
//            }
            //model.addAttribute("newUser", user); // FIXME: 14.02.2024 ( if you use taglib spring , or you must write @ModelAttribute in method)               return "reg";
            return "reg";
        }
        return "redirect:/";
    }


    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("newLogin", new LoginDto());
        return "login";
    }

    @PostMapping("login")
    public String login(@ModelAttribute("newLogin") @Validated LoginDto loginDto,
                        BindingResult bindingResult,
                        Model model) {
        if (bindingResult.hasErrors()) {
            return "login";
        }
        return "redirect:/";
    }
}
