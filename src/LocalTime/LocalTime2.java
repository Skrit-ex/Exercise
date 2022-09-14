package LocalTime;

import java.time.LocalTime;

public class LocalTime2 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
    int hour = time.getHour();
    int minute = time.getMinute();
    int second = time.getSecond();

       // System.out.println("Часы " + hour);
       // System.out.println("Минуты " + minute);
       // System.out.println("Секунды " + second);



        System.out.println(" Текущее время : " + time + minute + second);
    }
}
