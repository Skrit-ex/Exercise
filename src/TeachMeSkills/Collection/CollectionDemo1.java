package TeachMeSkills.Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo1 {
    public static void main(String[] args) {


        int []arr = new int[10];

        arr[1] = 19;

        int i = arr[1];

        int length = arr.length;

        List<String> list = new ArrayList<>();

        String s =  list.get(1);

        list.add("Hello java 1");
        list.add("Hello java 2");
        list.add("Hello java 3");
        for (String str: list) {
            System.out.println(str);

        }
    }
}
