package Exersice.String.Builder;

public class BilderDemo {
    public static void main(String[] args) {
        StringBuilder stroka = new StringBuilder("Javac");
        System.out.println("string.length = " + stroka.length());

        System.out.println("*setCharAt имеет возможность менять символы в строке");
        stroka.setCharAt(1,'i');
        System.out.println("* setLength ограничивает длину строки");
        stroka.setLength(2);
        System.out.println(stroka);
        System.out.println(" Метод append используется для конкатенации строк");
        stroka =stroka.append("+").append("differnt").append("=").append("this");
        System.out.println(stroka);
    }
}
