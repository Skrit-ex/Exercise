package TeachMeSkills.Enum;
import Calculator.CalculatorTMS.util.util.ConsoleReader;
import Calculator.CalculatorTMS.util.util.ConsoleWriter;

import java.util.Locale;


public class Calculator {

    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        writer.write("enter num1");
        double num1 = reader.readDouble();
        writer.write("enter num2");
        double num2 = reader.readDouble();
        writer.write("enter type Operation");
        Operation type = Operation.valueOf(reader.readString().toUpperCase(Locale.ROOT));
        Oper op = new Oper(num1,num2,type);
        Calculate calculate = new Calculate();
        Oper result = calculate.calculate(op);
        writer.write("Your result " + result.result);

    }
}
