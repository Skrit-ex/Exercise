package tms.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfiguration.class);
        User user = applicationContext.getBean("user", User.class);

        user.sayHello();

        System.out.println(user);
    }
}
