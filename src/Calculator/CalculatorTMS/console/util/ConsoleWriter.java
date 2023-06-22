package Calculator.CalculatorTMS.console.util;


import Calculator.CalculatorTMS.entity.Operation;
import Calculator.CalculatorTMS.InterfaceModule.Writer;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class ConsoleWriter implements Writer {

    public void write(String message) {
        System.out.println(message);

    }

    public void writeError(String message) {
        System.err.println(message);
    }

    public void writeOperationStorage(List<Operation> storage) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd");
        for (Operation operation : storage) {
            if (operation != null) {
                write(operation.getNum1() + " " + operation.getType() + " " + operation.getNum2() + " = "
                        + operation.getResult() + "  Date: " + operation.getTime().format(dateTimeFormatter));
            }
        }
    }
}
