package Calculator.Plus.ShowLibrary;

import Calculator.Plus.*;

import java.util.List;

public class Library {
    Writer writer = new ConsoleWriter();
    ConsoleWriter consoleWriter = new ConsoleWriter();
    InMemoryOperationStorage storage = new InMemoryOperationStorage();
    Reader reader = new ConsoleReader();
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
