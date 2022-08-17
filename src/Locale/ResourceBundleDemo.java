package Locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) {
        printInfo("", "");
        printInfo("en", "US");
        printInfo("ru", "RU");
    }
    public static void printInfo(String language, String country){
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("topic", current);
        for (String key : rb.keySet()){
            String value = rb.getString(key);
            System.out.println(value);
        }
        System.out.println();
    }
}
