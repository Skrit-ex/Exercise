package Exersice.String.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        String strinPattern = "[a-z]+";
        String text = "I study java 2 years";
        Pattern pattern = Pattern.compile(strinPattern);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
