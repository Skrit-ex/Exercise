package tms.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        User user = applicationContext.getBean("User", User.class);
        System.out.println(user);
    }
}
