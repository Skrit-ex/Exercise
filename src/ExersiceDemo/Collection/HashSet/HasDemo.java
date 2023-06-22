package ExersiceDemo.Collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HasDemo {
    public static void main(String[] args) {
        Set<String> hasset = new HashSet<>();

        hasset.add("Харьков");
        hasset.add("Киев");
        hasset.add("Львов");
        hasset.add("Кременчуг");
        hasset.add("Харьков");

        System.out.println(hasset);
    }
}
