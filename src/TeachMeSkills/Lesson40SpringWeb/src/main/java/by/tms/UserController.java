package by.tms;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Binding;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/reg")
    public String reg() {
        return "reg";
    }

    @PostMapping("reg")
    public String reg(@Validated User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                model.addAttribute(fieldError.getField(), fieldError.getDefaultMessage());
            }
                return "reg";
            }
            return "redirect:/";
        }
    }
