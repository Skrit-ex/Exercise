package by.validation;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler
    public String re(RuntimeException e, Model model){
        model.addAttribute("message", e.getMessage());
        return "error";
    }
}
