package tms.springCore;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Cat {

    @PostConstruct
    void init(){
        System.out.println("Cat init");
    }

    @PreDestroy
    void destroy(){
        System.out.println("Cat Destroy");
    }
}
