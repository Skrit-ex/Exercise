package Calculator.Plus;


public class ConsoleApplication implements Application {

    OperationStorage storage = new InMemoryOperationStorage();

    Calculator calculator = new Calculator();

    Reader reader = new ConsoleReader();

    Writer writer = new ConsoleWriter();



    @Override
    public void run() {
        boolean continueCalculator = true;
            while (continueCalculator) {
                writer.write("Enter num1");
                double num1 = reader.readDouble();
                writer.write("Enter num 2");
                double num2 = reader.readDouble();
                writer.write("Enter operation type -> (sum/min/mul/div)");
                String type = reader.readString();
                Operation op = new Operation(num1, num2, type);
                Operation result = calculator.calculate(op);
                storage.save(result);
                writer.write("Result = " + result.result);
                writer.write(" ");


                writer.write("Would you like continue calculations?  yes/no");
                String answer = reader.readString();
                switch (answer) {
                    case "yes": {
                        writer.write("Continue ");
                        break;
                    }
                    case "no": {
                        writer.write("Program stops working ");
                        continueCalculator = false;
                        break;
                    }
                    default:
                        writer.write("You inputted error, program stops working ");
                        continueCalculator = false;
                }
            }

                Operation[] all = storage.findAll();
                writer.write("Want to see the library? yes/no");
                String answer = reader.readString();
                switch (answer){
                    case "yes":{

                    }
            }
    }
}
