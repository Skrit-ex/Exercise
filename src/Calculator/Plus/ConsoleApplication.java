package Calculator.Plus;


import TeachMeSkills.Enum.Oper;
import TeachMeSkills.Exception.OperationNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsoleApplication implements Application {
    private final Calculator calculator = new Calculator();
    private final Reader reader = new ConsoleReader();
    private final ConsoleWriter consoleWriter = new ConsoleWriter();
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
                Operation op = new Operation(num1, num2, type);
                Optional<Operation> result = calculator.calculate(op);
                storage.save(result.get());

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
                        consoleWriter.writeOperationStorage(all);
                        writer.write(" ");
//                        List<Operation> operations = storage.findAll();
//                        for(Operation operation: operations) {
//                            writer.write("Num1: " + operation.getNum1() + " " + operation.getType() + " Num2: " +
//                                    operation.getNum2() + " = " + operation.getResult());
//                        }
//                        Stream<Operation> stream = operations.stream();
//                            List<Double> collect = operations.stream()
//                                    .sorted()
//                                    .map(operation -> operation.getNum1() + operation.getNum2())
//                                    .collect(Collectors.toList());
//                            writer.write(collect + " ");
//                            for(Operation operation: all){
//                                    writer.write(operation.getNum1() + " " + operation.getType() + " " +
//                                            operation.getNum2() + " = " + operation.getResult()+ " ");
//                            }
                        }
                     case "no"->
                        writer.write("stop program");
            }
    }
}
