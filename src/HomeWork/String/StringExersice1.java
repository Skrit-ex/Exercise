package HomeWork.String;

import java.util.Locale;

public class StringExersice1 {
    public static void demometod(String stroka) {
        System.out.println(stroka);
        System.out.print("Длина строки - ");
        System.out.println(stroka.length());
        System.out.print("последний символ - ");
        System.out.println(stroka.charAt(13));
        System.out.print("Строка заканчивается на !!! - ");
        System.out.println(stroka.endsWith("!!!"));
        System.out.print("Строка начинаается на I like - ");
        System.out.println(stroka.startsWith("I like"));
        System.out.print("Содержит ли строка java - ");
        System.out.println(stroka.contains("java"));
        System.out.print("Положение java в строке - ");
        System.out.println(stroka.indexOf("Java"));
        System.out.print("Заменить все сиволы a на o - ");
        System.out.println(stroka.replace("a","o"));
        System.out.print("Преобразование строки к верхнему и нижнему регистру регистру - ");
        System.out.print(stroka.toUpperCase(Locale.ROOT) + "   ");
        System.out.println(stroka.toLowerCase(Locale.ROOT));
        System.out.print("Вырезать java из строки - ");
        stroka.substring(7,11);
        System.out.print(stroka.replace("java", ""));
    }

    public static void main(String[] args) {
        demometod("I like java!!!");

    }
}