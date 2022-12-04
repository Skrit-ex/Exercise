package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        File file = new File("adaw");
        while (true) {
            int x = Integer.parseInt(scanner1.nextLine());
            if (x != 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("пользователь ввел что-то кроме 0");
                }
            }


            try {
                Scanner scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                System.out.println("file not found");
            } catch (IOException e) {
                System.out.println("file not found");
            }
        }
    }
}
