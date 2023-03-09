package Calculator.Mod;

import java.util.Scanner;

public class GetOperations {
    Scanner scanner = new Scanner(System.in);


    public char getChar() {
        System.out.println(" Input operation : +, -, *, / ");
        char operation;
        if (scanner.hasNextLine()) {
            operation = scanner.nextLine().charAt(0);
        } else {
            System.out.println(" Error input, try again");
            scanner.next();
            operation = getChar();
        }
        return operation;
    }
}
