package TeachMeSkills.Date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;


public class DateDemo {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate today1 = today.plusDays(5);
        System.out.println(today1);

        LocalTime time = LocalTime.now();
        LocalTime time1 = time.plusHours(5);
        System.out.println(time1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm dd:yy");
        String simpleDateFormat1 = simpleDateFormat.format(today);
        System.out.println(simpleDateFormat1);

    }
}
