package ExersiceDemo.Exersice.String.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExersice {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("aa*b");
        Matcher matcher = pattern.matcher("aaab");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
