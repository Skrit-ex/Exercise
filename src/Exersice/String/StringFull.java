package Exersice.String;
import java.lang.String;

public class StringFull {
    public static void main(String[] args) {
        strin("I like java!!!");
        //strin ("I like Pyton!!!");
        //strin("I like C++!!!");
    }

    private static void strin(String st){

        System.out.println("* ѕровер€ет заканчиваетс€ ли строка на данные символы");
        System.out.println(st.endsWith("!!!"));
        System.out.println("* ѕровер€ет начинаетс€ ли строка на данные символы");
        System.out.println(st.startsWith("I like"));
        System.out.println("* ѕровер€ет наличие данного символа/символов в данной строке");
        System.out.println(st.contains("1"));
        System.out.println("* ѕровер€ет строку сначала на наличие данного символа и выводит его положение в строке (возможность указать с какого символа начать поиск)");
        System.out.println("(lastIndexOf поиск с конца строки)");
        System.out.println(st.indexOf("l") + st.lastIndexOf("k"));

        System.out.println("* concat сложение строк");
        System.out.println(st.concat(" more"));
        System.out.println("* «амен€ет выбранное значени€ в строке");
        System.out.println(st.replace("I", "You"));
        System.out.println("* toLowerCase уменьшение всех символов  - toUpperCase увеличение");
        System.out.println(st.toLowerCase() + st.toUpperCase());
        System.out.println("* trim  убирает пробелы в начале и в конце строки");
        System.out.println("     I like java     ".trim());
        System.out.println("* isEmpty провер€ет пуста€ ли строка   isBlank return true еcли строка пуста€ или содержит  пробелы");
        System.out.println("ћетод join соедин€ет строки и дополнительно их можно разделить символом зап€той или другими ");
        System.out.println(st.join(",","Java","Keep","Osa"));



    }
}
