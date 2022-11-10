package Collection.NavigableSet;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ferry {
    public static void main(String[] args) {
        NavigableSet<Integer> time = new TreeSet<>();

        time.add(1210);
        time.add(1420);
        time.add(1600);
        time.add(1820);
        time.add(2010);
        time.add(2100);

        SortedSet<Integer> subset = time.headSet(1500);
        System.out.println("Последний паром пред 16:00 -> " + subset.last());

        SortedSet<Integer> tailset = time.tailSet(2000);
        System.out.println("Первый паром после 20:00 -> " + tailset.first());
        System.out.println("");
        //java 6
        System.out.println("java 6 use new metod lower and higher");
        System.out.println("Последний паром пред 16:00 -> " + time.lower(1500));
        System.out.println("Последний паром пред 16:00 -> " + time.higher(2000));
    }
}
