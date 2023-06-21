package ExersiceDemo.HomeWork.String;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternSplit {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+\\s?");
        String [] words = pattern.split("java5tiger 77lake 1from 2Spain1craft");
        System.out.println(Arrays.toString(words));
    }
}
