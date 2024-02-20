package by.tms;

import by.tms.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Component
@RequestMapping("/operation")
public class OperationController {

@Autowired
    private OperationService operationService;


@GetMapping("/calc")
private String calc(){
    return "calc";
}

@PostMapping("calc")
    public String calc(@Validated Operation operation, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "reg";
        }
    operationService.save(operation);
        return "redirect:/";
}
}
