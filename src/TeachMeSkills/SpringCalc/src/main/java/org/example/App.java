package org.example;

import org.example.Spring.CoreConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App{


    public static void main(String[] args) {

//        Application application = new ConsoleApplication();
//        application.run();

        ApplicationContext application = new AnnotationConfigApplicationContext(CoreConfiguration.class);
        ConsoleApplication consoleApplication = application.getBean("consoleApplication", ConsoleApplication.class);

        consoleApplication.run();
    }
}
