package Exersice.String.Formatter;

import java.util.Formatter;

// задание
// Cтудент (фамилия) получил (оценку) по предмету ()

public class FormatterExersice {
    public static void main(String[] args) {
    Format("Ivan", "9.5", "Phy");

    }
    private static void Format(String name, String mark, String predmet){
        Formatter formatter = new Formatter();
        formatter.format("Cтудент %5s получил %5s по предмету %3s", name, mark, predmet);
        System.out.println(formatter);



    }
}
