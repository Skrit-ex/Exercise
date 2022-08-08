package HomeWork.String;

import java.util.Formatter;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        String stroka =  "Sklera";
        Formatter f =  new Formatter();
        System.out.println(f.format("%s --> \"%s\"%n", stroka,stroka.substring(stroka.length()/2-1, stroka.length()/2+1)));
        System.out.println(f.format("%s --> \"%S\"%n", stroka, stroka));

        String[] word = {"rexede", "imkliv", "starte" };
        for (String words : word) {
            System.out.printf("%s --> \"%s\"%n", words, words.substring(words.length() / 2 - 1, words.length() / 2 + 1));
        }
    }
}
