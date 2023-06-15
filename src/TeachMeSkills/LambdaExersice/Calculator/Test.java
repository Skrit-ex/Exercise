package TeachMeSkills.LambdaExersice.Calculator;

import TeachMeSkills.LambdaExersice.Calculator.ReaderWriter.ConsoleReader;

public class Test {
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
//        double num1 = consoleReader.readDouble();
//        System.out.println(num1);
//        String awd = consoleReader.readString();
//        System.out.println(awd);


        Application app = new Application();
        app.run();
    }
}
