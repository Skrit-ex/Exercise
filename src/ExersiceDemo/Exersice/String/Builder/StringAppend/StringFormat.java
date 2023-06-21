package ExersiceDemo.Exersice.String.Builder.StringAppend;

public class StringFormat {
    public static void main(String[] args) {

        String stroka = "Hello %s";

        String strokaMod = String.format(stroka, "Jack");

        System.out.println(strokaMod);
    }
}
