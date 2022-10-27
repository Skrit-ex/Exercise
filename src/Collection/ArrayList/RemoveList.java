package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        System.out.println("Изначальное размер arrayList " + arrayList.size());

        arrayList.add("a");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("DE");
        arrayList.add("FE");
        arrayList.add("E");
       // arrayList.add(1,"B");
        arrayList.set(0,"A");

        System.out.println("Содержимое arrayList до removeAll" + arrayList);
            List<String> removeList =  List.of("DE","CE","FE");

        arrayList.removeAll(removeList);
        System.out.println("Cодержимое arrayList после removeAll " + arrayList);


    }
}
