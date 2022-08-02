package Exersice.String.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExersice2 {
    public static void main(String[] args) {
        System.out.println(test("google.com"));

    }
    private static boolean test(String testString){
        Pattern pattern = Pattern.compile(".+\\.(com|by|ru)");
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
}
