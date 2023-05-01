package TeachMeSkills.OOP.Encapsulation;


public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

        writer.print("Input num1");
        double num1 = reader.readDouble();
        writer.print("Input num2 ");
        double num2 = reader.readDouble();
        writer.print("Input type operation");
        String type = reader.readString();

        Operations operations = new Operations(num1,num2, type);

        Operations result = calculator.calculate(operations);
        writer.print("your result = " + result.getResult());
        }




    }
