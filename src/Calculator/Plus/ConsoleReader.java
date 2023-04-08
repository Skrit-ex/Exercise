package Calculator.Plus;

import java.util.Scanner;

public class ConsoleReader implements Reader{

    Scanner scanner = new Scanner(System.in);

    public String readLine() {
        return scanner.next();
    }


    public double readDouble() {
        return scanner.nextDouble();
    }
}
