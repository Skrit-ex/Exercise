package Calculator.Plus;

public class ConsoleApplication implements Application {

    OperationStorage storage = new InMemoryOperationStorage();

    Calculator calculator = new Calculator();

    Reader reader = new ConsoleReader();

    Writer writer = new ConsoleWriter();

    @Override
    public void run() {
            while (true){
                writer.write("Enter num1");
                double num1 = reader.readDouble();
                writer.write("Enter num 2");
                double num2 = reader.readDouble();
                writer.write("Enter operation type");
                String type = reader.readString();
                Operation op = new Operation( num1, num2, type);
                Operation result = calculator.calculate(op);
                writer.write("Result = " + result);
            }
    }
}
