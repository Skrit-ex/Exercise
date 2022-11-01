package Collection.Comparable;

import java.util.SortedSet;
import java.util.TreeSet;

public class ComporablePersonDemo {
    public static void main(String[] args) {
        SortedSet<Person> set = new TreeSet<>();
        set.add(new Person("Pavel","Ivanov",15));
        set.add(new Person("Ruslan","Karpov",17));
        set.add(new Person("Nikolai","Solov",16));

        set.forEach(System.out::println);
    }

}
