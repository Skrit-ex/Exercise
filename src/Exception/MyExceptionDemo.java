package Exception;

import java.util.Scanner;

public class MyExceptionDemo {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x!=0){
                throw new MyException("Пользователь ввел что-то кроме нуля");
            }
        }
    }
}
