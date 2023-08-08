package Calculator.CalculatorTMS.util;

import Calculator.CalculatorTMS.entity.OperationType;
import TeachMeSkills.Exception.OperationNotFoundException;

import java.util.Scanner;

public class ConsoleReader implements Calculator.CalculatorTMS.util.util.Reader {

    Scanner scanner = new Scanner(System.in);


    public String readString() {
        return scanner.next();
    }

    public double readDouble() {
        return scanner.nextDouble();
    }

    private final String[] types = new String[]{"SUM","SUB","MUL","DIV"};

    @Override
    public OperationType readOperationType() throws OperationNotFoundException {
        String type = scanner.next().toUpperCase();
        for(String s: types){
            if(s.equals(type)){
                OperationType.valueOf(type);
            }
        }

        return OperationType.valueOf(type);
    }
}
