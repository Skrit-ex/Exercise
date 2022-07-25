package Exersice.String;

public class String {
    public static void main(String[] args) {
        System.out.println("Foobar".endsWith("bar"));
        System.out.println("Foobar".startsWith("Foo"));
        System.out.println("Foobar".contains("oo"));    // содержит ли строка данные символы
        System.out.println("Hello world".regionMatches(6, "world", 0, 3));
    }
}
