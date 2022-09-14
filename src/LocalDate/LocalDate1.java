package LocalDate;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDate1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        int dayYear = today.getDayOfYear();
        DayOfWeek dayofWeek = today.getDayOfWeek();

        System.out.println("Год " + year);
        System.out.println("Месяц " + month);
        System.out.println("День " + day);
        System.out.println("День в году " + dayYear);
        System.out.println(" День в неделе " + dayofWeek);
        

    }
}
