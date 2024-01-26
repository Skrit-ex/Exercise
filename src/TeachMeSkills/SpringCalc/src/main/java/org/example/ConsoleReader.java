package org.example;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleReader {
    Scanner scanner = new Scanner(System.in);

    public double readNum(){
       return scanner.nextDouble();
    }

    public String readText(){
        return scanner.next();
    }
}
