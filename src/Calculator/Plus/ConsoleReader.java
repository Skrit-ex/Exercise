package Calculator.Plus;

import java.util.Scanner;

public class ConsoleReader implements Reader{

    Scanner scanner = new Scanner(System.in);


    public String readString() {
        return null;
    }

    public double readDouble() {
        return scanner.nextDouble();
    }
}
