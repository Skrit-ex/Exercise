package Calculator.CalculatorTMS.console;

import Calculator.CalculatorTMS.storage.*;
import Calculator.CalculatorTMS.util.util.ConsoleReader;
import Calculator.CalculatorTMS.util.util.ConsoleWriter;
import Calculator.CalculatorTMS.Application;
import Calculator.CalculatorTMS.util.util.Reader;
import Calculator.CalculatorTMS.util.util.Writer;
import Calculator.CalculatorTMS.entity.Operation;
import Calculator.CalculatorTMS.entity.OperationType;
import Calculator.CalculatorTMS.service.Calculator;
import Calculator.CalculatorTMS.validator.OperationValidator;
import TeachMeSkills.Exception.OperationNotFoundException;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class ConsoleApplication implements Application {
    private final Calculator calculator = new Calculator();
    private final Reader reader = new ConsoleReader();
    private final Writer writer = new ConsoleWriter();
    private final InMemoryOperationStorage storage = new InMemoryOperationStorage();
    private final Library library = new Library();
    private final OperationStorage fileStorage = new FileOperationStorage();
    private final OperationValidator valid = new OperationValidator();
    private final GsonOperationStorage gStorage = new GsonOperationStorage();
    private final JDBCOperationStorage jdbcOperationStorage = new JDBCOperationStorage();

    @Override
    public void run() throws IOException {
        boolean continueCalculator = true;
        while (continueCalculator) {
            boolean isValid = false;

            writer.write("Enter num1");
            double num1 = reader.readDouble();
            isValid = (valid.validNum(String.valueOf(num1)));
            if (!isValid) {
                continue;
            }
            writer.write("Enter num 2");
            double num2 = reader.readDouble();
            if(! valid.validNum(String.valueOf(num2))){
                continue;
            }
            writer.write("Enter operation type -> (sum/min/mul/div)");
            OperationType type;
            try {
                type = reader.readOperationType();
                if(!(valid.validType(String.valueOf(type)))){
                    continue;
                }
            } catch (OperationNotFoundException e) {
                writer.write("Operation not found");
                continue;
            }
            Operation op = new Operation(num1, num2, type);
            Optional<Operation> result = calculator.calculate(op);
            storage.save(result.get());
            fileStorage.save(result.get());
            gStorage.save(result.get());
            jdbcOperationStorage.save(result.get());
            writer.write("Your result = " + op.getResult());

            writer.write("Would you like continue calculations?  yes/no");
            String answer = reader.readString();
            switch (answer) {
                case "yes" -> writer.write("Continue ");
                case "no" -> {
                    writer.writeError("Program stops working ");
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

        printHistory(jdbcOperationStorage.findAll());

        LibraryGson libraryGson = new LibraryGson();  // FIXME: 25.07.2023 
        libraryGson.gsonLibrary(all);
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
//            }

    }

    private void printHistory(List<Operation> operations) {
        for (Operation operation : operations) {
                writer.write(operation.toString());
                writer.write(" ");
        }
    }
}
