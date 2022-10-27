package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAllDemo {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        List<String> array1 = Arrays.asList("AA", "ASA", "BSA");


        array.add("AA");
        array.add("B");
        array.add("C");
        array.add("ASA");
        array.add("FE");
        array.add("E");

        System.out.println("Размер array до удаления: "
                + array.size());
        array.retainAll(array1);
        System.out.println(array);
        System.out.println("Размер array после удаления: "
                + array.size());
    }
}
