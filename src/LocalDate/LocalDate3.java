package LocalDate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDate3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2022,9,14);

        LocalDate today1 = today.with(ChronoField.YEAR, 2023);
        LocalDate today2 =  today.withYear(2024);
        LocalDate today3 = today.withMonth(12);
        LocalDate today4 = today.withDayOfMonth(18);
        LocalDate test = today.withDayOfYear(16).withDayOfMonth(15);

        System.out.println(today);
        System.out.println();

        System.out.printf("%-15s После редактирования","");
        System.out.println();
        System.out.println(""+today1);
        System.out.println(today2);
        System.out.println(today3);
        System.out.println(today4);
        System.out.println(test);
    }
}