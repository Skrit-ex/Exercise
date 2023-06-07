package Calculator.Plus;


import TeachMeSkills.Exception.OperationNotFoundException;

import java.util.List;

public class ConsoleApplication implements Application {

    private final Calculator calculator = new Calculator();

    private final Reader reader = new ConsoleReader();

    private final Writer writer = new ConsoleWriter();

    InMemoryOperationStorage storage = new InMemoryOperationStorage();
   // OperationStorage fileStorage = new FileOperationStorage();

    @Override
    public void run() {
        boolean continueCalculator = true;
            while (continueCalculator) {
                writer.write("Enter num1");
                double num1 = reader.readDouble();

                writer.write("Enter num 2");
                double num2 = reader.readDouble();

                writer.write("Enter operation type -> (sum/min/mul/div)");
                OperationType type;
                try {
                    type = reader.readOperationType();
                }catch (OperationNotFoundException e){
                    writer.write("Operation not found");
                    continue;
                }
                double resul = 0;
                Operation op = new Operation(num1, num2, type, resul);
                Operation result = calculator.calculate(op);
                storage.save(result);
                writer.write("Result = " + result.getResult());
                writer.write(" ");

                writer.write("Would you like continue calculations?  yes/no");
                String answer = reader.readString();
                switch (answer) {
                    case "yes" -> writer.write("Continue ");
                    case "no" -> {
                        writer.write("Program stops working ");
                        continueCalculator = false;
                    }
                    default -> {
                        writer.writeError("You inputted error, program stops working ");
                        continueCalculator = false;
                    }
                }
            }
                List<Operation> all = storage.findAll();
                writer.write("Want to see the library? yes/no");
                String answer = reader.readString();
                switch (answer){
                    case "yes" -> {
                        List<Operation> operations = storage.findAll();
                        for(Operation operation: operations){
                            writer.write("Num1: " + operation.getNum1() + " " + operation.getType() +  " Num2: " +
                                    operation.getNum2() + " = " + operation.getResult() );
                            }
                            for(Operation operation: all){
                                    writer.write(operation.getNum1() + " " + operation.getType() + " " +
                                            operation.getNum2() + " " + operation.getResult());
                            }
                        }
                     case "no"->
                        writer.write("stop program");
            }
    }
}
