package LocalDate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDate2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

    int year = today.get(ChronoField.YEAR);
    int month = today.get(ChronoField.MONTH_OF_YEAR);
    int day = today.get(ChronoField.DAY_OF_WEEK);
    int dayOfYear = today.get(ChronoField.DAY_OF_YEAR);

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfYear);
    }
}
