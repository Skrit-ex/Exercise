package ExersiceDemo.Enum;

public class EnumMain {

    public static void main(String[] args) {
        Animal animal = Animal.CAT;


        switch (animal) {
            case CAT:
                System.out.println("It's a cat");
                break;
            case DOG:
                System.out.println(" It's a dog");
                break;
            case MOUSE:
                System.out.println("It's a mouse");
                break;
            default:
                System.out.println("It's not a animal");
        }
        Season season = Season.SUMMER;
        System.out.println(season.getTranslation());
        System.out.println("temper " + season.getTemperat());
        switch
        (season) {
            case WINTER:
                System.out.println("It's cold outside");
                break;
            case SUMMER:
                System.out.println("It's warm outside");
                break;
        }
    }
}
