package Calculator.Plus;


public class ConsoleApplication implements Application {

    private final Calculator calculator = new Calculator();

    private final Reader reader = new ConsoleReader();

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
                writer.write("Enter operation type -> (SUM/MIN/MUL/DIV)");
                Operat type = Operat.valueOf(reader.readString());
                double resul = 0;
                Operation op = new Operation(num1, num2, type, resul);
                Operation result = calculator.calculate(op);
                storage.save(result);
                writer.write("Result = " + result.getResult());
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
                                writer.write(all[i].getNum1() + " " + all[i].getType() + " " + all[i].getNum2() + " = "
                                        + all[i].getResult());
                            }
                            }else{
                            for(Operation operation: all){
                                    writer.write(operation.getNum1() + " " + operation.getType() + " " +
                                            operation.getNum2() + " " + operation.getResult());
                            }
                        }
                    } case "no"->
                        writer.write("stop program");
            }
    }
}
