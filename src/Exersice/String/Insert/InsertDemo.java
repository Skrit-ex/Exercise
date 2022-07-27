package Exersice.String.Insert;

public class InsertDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("I like");

        stringBuilder.insert(2, " java");
        System.out.println(stringBuilder);
    }
}
