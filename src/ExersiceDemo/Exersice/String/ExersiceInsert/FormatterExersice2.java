package ExersiceDemo.Exersice.String.ExersiceInsert;

import java.util.Formatter;

public class FormatterExersice2 {
    public static void main(String[] args) {
        double x = 1000 / 3;
        System.out.println(x);
        Formatter formatter = new Formatter();
        formatter.format("строка с форматированием %.2f%n", x);
        formatter.format("строка с форматированием %8.2f%n", x);
        formatter.format("строка с форматированием %16.2f%n", x);
        System.out.println(formatter);
    }
}
