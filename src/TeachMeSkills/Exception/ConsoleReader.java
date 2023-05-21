package TeachMeSkills.Exception;

import java.util.Scanner;

public class ConsoleReader {

    private final Scanner scanner = new Scanner(System.in);

    private final String [] types = new String[]{"SUM", "SUB", "MUL", "DIV"};

    public TypeOperation readOperationType() throws OperationNotFoundException{
        String next = scanner.next();
        String type = next.toUpperCase();
        for (String s: types) {             // проверка s на types
            if(s.equals(type)){
               return TypeOperation.valueOf(type);
            }
        }
        throw new OperationNotFoundException();
    }
}
