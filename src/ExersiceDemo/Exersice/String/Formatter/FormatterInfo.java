package ExersiceDemo.Exersice.String.Formatter;

import java.util.Formatter;

public class FormatterInfo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("This %s is about %n%S %c", "book", "java", '9');     // %n - ������� ������, %S ��������� �������
        System.out.println(formatter);
    }
}
