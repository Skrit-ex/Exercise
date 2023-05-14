package Calculator.Plus;


public class ConsoleApplication implements Application {

    Calculator calculator = new Calculator();

    Reader reader = new ConsoleReader();

    Writer writer = new ConsoleWriter();

    InMemoryOperationStorage storage = new InMemoryOperationStorage();



    @Override
    public void run() {
        boolean continueCalculator = true;
            while (continueCalculator) {
                writer.write("Enter num1");
                double num1 = reader.readDouble();
                writer.write("Enter num 2");
                double num2 = reader.readDouble();
                writer.write("Enter operation type -> (sum/min/mul/div)");
                Operat type = Operat.valueOf(reader.readString());
                Operation op = new Operation(num1, num2, type);
                Operation result = calculator.calculate(op);
                storage.save(result);
                writer.write("Result = " + result.result);
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
                        writer.write("You inputted error, program stops working ");
                        continueCalculator = false;
                    }
                }
            }

                Operation[] all = storage.findAll();
                writer.write("Want to see the library? yes/no");
                String answer = reader.readString();
                switch (answer){
                    case "yes" -> {
                        int countOperations = storage.getCountOperations();
                        if(countOperations < 10){
                            for(int i=0; i< countOperations; i++) {
                                writer.write(all[i].num1 + " " + all[i].type + " " + all[i].num2 + " = " + all[i].result);
                            }
                            }else{
                            for(Operation operation: all){
                                    writer.write(operation.num1 + " " + operation.type + " " + operation.num2 + " " + operation.result);

                            }
                        }
                    } case "no"->
                        writer.write("stop program");
            }
    }
}
