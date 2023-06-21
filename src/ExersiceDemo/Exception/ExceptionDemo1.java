package ExersiceDemo.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        File file = new File("dawd");

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


    }
}