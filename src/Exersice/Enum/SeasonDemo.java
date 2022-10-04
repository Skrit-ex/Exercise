package Exersice.Enum;

public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        Season season1 = Season.valueOf("WINTER"); // метод проверяет и выводит "string значения" из списка перечисления enum
        System.out.println(season1);
        print(season);
        PrintValue();
    }
    public static void print(Season season){
        switch (season) {
            case AUTUMN -> {
                System.out.println("you like autumn");
                break;
            }
            case SPRING -> {
                System.out.println("you like spring");
                break;
            }
            case SUMMER -> {
                System.out.println("you like summer");
                break;
            }
            case WINTER -> {
                System.out.println(" you like winter");
            break;
        }

        }
    }
    public static void PrintValue(){
        for(Season s : Season.values()){
            System.out.println(s +"   Place -> " +  s.ordinal() +"     Sred Temper ->  "+ s.getAvrgTmp());        // metod ordinal указывает позицию значений перечесления
            System.out.println(s + " "+ s.getDescription());
        }
    }
}
