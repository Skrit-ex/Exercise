package ExersiceDemo.Exersice.String.Builder.Insert;

public class InsertDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("I like");

        stringBuilder.insert(1, " java");
        System.out.println(stringBuilder);
    }
}
