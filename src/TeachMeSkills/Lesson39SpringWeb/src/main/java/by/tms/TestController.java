package by.tms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {

    // GET localhost:8080/test?name=Test&age=22

    @GetMapping
    public String test(String name, @RequestParam(defaultValue = "0") int age){   // @RequestParam, if user input empty age
        System.out.println(name);
        System.out.println(age);
        return "test";
    }

        //localhost:8080/test/name/????/age/?????
    @GetMapping("/name/{name}/age/{age}")
    public String test4(@PathVariable("name") String name, @PathVariable("age") int age) {
        System.out.println(name);
        System.out.println(age);
        return "test";
    }


    //get localhost:8080/test/test1?name=test&age=12
    @GetMapping("/test1")
    public ModelAndView test(String name,
                             @RequestParam(defaultValue = "0") int age,
                             ModelAndView modelAndView){
        modelAndView.setViewName("test");
        modelAndView.addObject("myName", name);
        modelAndView.addObject("age", age);

        return modelAndView;
    }
    // GET localhost:8080/test/test

//    @GetMapping("/test")
//    public String test2(){
//        return "test2";
//    }
}
