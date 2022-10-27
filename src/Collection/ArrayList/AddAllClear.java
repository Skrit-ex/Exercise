package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAllClear {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        List<String> arrayList2 = Arrays.asList("1", "2");

        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");
        arrayList1.add("F");

        System.out.println("arrayList до добавления " + arrayList1);

        arrayList1.addAll(3, arrayList2);
        System.out.println("arrayList после добавление элементов " + arrayList1);

        arrayList1.clear();
        System.out.println("arrayList после очистки " + arrayList1);
    }
}
