package TeachMeSkills.LambdaExersice.Calculator;

import TeachMeSkills.LambdaExersice.Calculator.ReaderWriter.ConsoleReader;
import TeachMeSkills.LambdaExersice.Calculator.ReaderWriter.ConsoleWriter;
import TeachMeSkills.LambdaExersice.Calculator.Storage.OperationStorage;

import java.util.Locale;

import static TestProject.Calculator.OperationType.valueOf;

public class Application {

    ConsoleWriter writer = new ConsoleWriter();
    ConsoleReader reader = new ConsoleReader();
    OperationStorage storage = new OperationStorage();
    private boolean cal;

    public void run() {
        while (cal = true) {
            writer.write("Welcome, do you want calculate few number?  yes/no");
            String answer1 = reader.readString();
            if (answer1.equals("no")) {
                writer.writeError("Program terminated");
                cal = false;
            }
            while ((answer1.isEmpty())|| (answer1 == null)){
                writer.writeError("Field is empty");
                answer1 = reader.readString();
            }
            while (!(answer1.equals("yes"))) {
                writer.writeError("Error , try again");
                answer1 = reader.readString();
            }

                writer.write(" Enter num1 ");
                double num1 = reader.readDouble();
                writer.write(" Enter num2 ");
                double num2 = reader.readDouble();
                writer.write(" Select operation sum/sub/mul/div ");
                OperationType type = valueOf(reader.readString().toUpperCase(Locale.ROOT));
                Operation operation = new Operation(num1, num2, type);
                Calculator calculator = (operation1) -> {
                    switch (operation.getType()) {
                        case SUM -> operation.setResult(operation.getNum1() + operation.getNum2());
                        case SUB -> operation.setResult(operation.getNum1() - operation.getNum2());
                        case MUL -> operation.setResult(operation.getNum1() * operation.getNum2());
                        case DIV -> operation.setResult(operation.getNum1() / operation.getNum2());
                        default -> writer.writeError("Input error");
                    }
                    ;
                    return operation;
                };
                Operation result = calculator.calculator(operation);
                writer.write(operation.getResult() + " ");
                storage.save(operation.getResult());
                writer.write("Would you return calculate? yes/no");
                String answer2 = reader.readString();
                while (answer2.isEmpty()) {
                    writer.writeError("Field is empty, try again");
                    answer2 = reader.readString();
                }
                if (answer2.equals("no")) {
                    writer.writeError("Program terminated");
                    cal = false;
                } else if (answer2.equals("yes")) {
                    run();
                }
            }
            ;
        }
    }