package ExersiceDemo.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        System.out.println("Изначальное размер arrayList " + arrayList.size());

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("f");
        arrayList.add("e");
        arrayList.add(1,"B");
        arrayList.set(0,"A");

        System.out.println("Размер arrayList после добавления элементов "+ arrayList.size());
        System.out.println("Содержимое arrayList после добавления элементов " + arrayList);


        }
    }
