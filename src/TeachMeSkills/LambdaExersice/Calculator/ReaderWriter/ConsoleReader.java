package TeachMeSkills.LambdaExersice.Calculator.ReaderWriter;

import TeachMeSkills.LambdaExersice.Calculator.OperationType;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public double readDouble() {
        if(scanner.hasNext()) {
            return scanner.nextDouble();
        }
        return readDouble();
    }

    @Override
    public String readString() {
        if (scanner.hasNext()) {
            return scanner.next();
        } else {
            System.err.println("Input error");
        }
        return readString();
    }

    @Override
    public OperationType readType() {
        return OperationType.valueOf(scanner.next());
    }
}
