package ExersiceDemo.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            readFile();
        }
        catch (FileNotFoundException e){
            System.out.println("Обработка исключения в методе main" +
                    "File not found");
        }

    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("fjkah");
        Scanner scanner = new Scanner(file);

    }
}
