package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class EnglishBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnglishBookApplication.class, args);
    }

}
