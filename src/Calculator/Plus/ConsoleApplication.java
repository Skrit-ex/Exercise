package Calculator.Plus;


import Calculator.Plus.ShowLibrary.Library;
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
    Library library = new Library();
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
                writer.write("Your result = " + op.getResult());

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
            library.showLibrary(all);
//                List<Operation> all = storage.findAll();
//                writer.write("Want to see the library? yes/no");
//                String answer = reader.readString();
//                switch (answer){
//                    case "yes" -> {
//                        consoleWriter.writeOperationStorage(all);
//                        writer.write(" ");
//                        }
//                     case "no"->
//                        writer.write("stop program");
//                    default -> writer.writeError(" Error, ");
//            }         l

    }
}
