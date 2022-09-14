package LocalTime;

import java.time.LocalTime;

public class LocalTime1 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(15,45);
        LocalTime time1 = LocalTime.of(15,45, 19);
        LocalTime time2 = LocalTime.of(15,45, 19, 1594);

        System.out.println("C часами 0-23 и минутами 0-59");
        System.out.println(time);
        System.out.println();
        System.out.println("C часами и минутами, секундами 0-59");
        System.out.println(time1);
        System.out.println();
        System.out.println("C часами и минутами секундами, ноносекундами 0-999,999,999");
        System.out.println(time2);
    }

}
