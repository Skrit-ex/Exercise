package org.example;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ConsoleApplication implements Application {

    private final ConsoleWriter writer;
    private final ConsoleReader reader;
    private final OperationService service;

    public ConsoleApplication(ConsoleWriter writer, ConsoleReader reader, OperationService service) {
        this.writer = writer;
        this.reader = reader;
        this.service = service;
    }

    @Override
    public void run() {

        while (true){
            writer.write("Enter num1");
            double num1 = reader.readNum();
            writer.write("Enter num2");
            double num2 = reader.readNum();
            writer.write("Enter type operation");
            String type = reader.readText();

            Operation operation = new Operation();
            operation.setNum1(num1);
            operation.setNum2(num2);
            operation.setType(type);

            Optional<Operation> calculate = service.calculate(operation);

            if(calculate.isPresent()){
                Operation operation1 =calculate.get();
                writer.write("Your result " + operation1.getResult());
            }else {
                writer.write("Error, Not found operation");
            }
        }
    }
}
