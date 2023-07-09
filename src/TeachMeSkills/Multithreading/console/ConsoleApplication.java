package TeachMeSkills.Multithreading.console;

import TeachMeSkills.Multithreading.entity.Operation;
import TeachMeSkills.Multithreading.service.OperationService;
import TeachMeSkills.Multithreading.until.ConsoleReader;
import TeachMeSkills.Multithreading.until.ConsoleWriter;

import java.util.Optional;

public class ConsoleApplication {

    private final ConsoleWriter writer = new ConsoleWriter();
    private final ConsoleReader reader = new ConsoleReader();

    private final OperationService operationService = new OperationService();
    public void run() {
        while (true) {
            writer.write("Enter num1");
            double num1 = reader.readDouble();
            writer.write("Enter num2");
            double num2 = reader.readDouble();
            writer.write("Enter type operation");
            String type = reader.readType();
            Optional<Operation> calculate = operationService.calculate(num1, num2, type);
            if(calculate.isPresent()){
                writer.write(calculate.get().toString());
            }
            else {
                writer.writeError("Operation not found");
            }

        }
    }
}
