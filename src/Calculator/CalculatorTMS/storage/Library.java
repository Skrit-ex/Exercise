package Calculator.CalculatorTMS.storage;

import Calculator.CalculatorTMS.util.util.ConsoleReader;
import Calculator.CalculatorTMS.util.util.ConsoleWriter;
import Calculator.CalculatorTMS.util.util.Reader;
import Calculator.CalculatorTMS.util.util.Writer;
import Calculator.CalculatorTMS.entity.Operation;

import java.util.List;

public class Library {
   private final Writer writer = new ConsoleWriter();
    private final ConsoleWriter consoleWriter = new ConsoleWriter();
    //private final InMemoryOperationStorage storage = new InMemoryOperationStorage();
    private final Reader reader = new ConsoleReader();
    public void showLibrary(List<Operation> all) {
        writer.write("Want to see the library? yes/no");
        String answer = reader.readString();
        switch (answer) {
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
            case "no" -> writer.write("stop program");
            default ->{
                writer.writeError(" Input Error, try again ");
                showLibrary(all);
            }
        }
    }

}
