package TeachMeSkills.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {


        Set<String> strings = new HashSet<String>();
        strings.add("Hello1");
        strings.add("Hello2");
        strings.add("Hello3");
        strings.add("Hello1");

        for (String str: strings) {
            System.out.println(str);
        }
    }
}
