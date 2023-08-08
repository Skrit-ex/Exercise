package TeachMeSkills.Web.CalculatorWeb.util;

import java.util.Scanner;

public class ConsoleReader implements Reader{
    private final Scanner scanner = new Scanner(System.in);
    @Override
    public double readDouble() {
        return scanner.nextDouble();
    }

    @Override
    public String readString() {
        return scanner.next();
    }
}
