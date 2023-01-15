package Enum;

public class TestError {
    private static final int DOG =1;
    private static final int CAT =2;
    private static final int MOUSE =3;

    public static void main(String[] args) {
        int animal = DOG;

        switch (animal) {
            case DOG -> System.out.println("It's a dog");
            case CAT -> System.out.println("It's a cat");
            case MOUSE -> System.out.println("It's a mouse");
            default -> System.out.println("It's not an animal");
        }
    }
}
