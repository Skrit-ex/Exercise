package ExersiceDemo.Collection.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedDemo {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

        set.add("Харьков");
        set.add("Киев");
        set.add("Львов");
        set.add("Кременчуг");
        set.add("Харьков");

        System.out.println(set);

        SortedSet<String> subSet = set.subSet("Киев", "Львов");
        //SortedSet, содержащий элементы из вызывающего множества, находящиеся между start и end-1.
        System.out.println("Subset : " + subSet);

        System.out.println(" HeadSet " + set.headSet("Львов"));
        System.out.println(" TailSet " + set.tailSet("Львов"));
        System.out.println("Первый элемент " + set.first());
        System.out.println("Последний элемент " + set.last());
    }
}