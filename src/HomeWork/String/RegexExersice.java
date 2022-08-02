package HomeWork.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExersice {
    public static void main(String[] args) {
        String sr = "Versions : Java 5, Java  6, Java 7, Java 8.";
        String pat = "Java\\s+\\d(1,2)";
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(sr);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
