package Collection.Comparator;

import Collection.Comparable.Person;

import java.util.SortedSet;
import java.util.TreeSet;

public class ComparatorPerson1 {
    public static void main(String[] args) {
        ComparatorDemo comparatorPerson1 =new ComparatorDemo();
        SortedSet<Person> set = new TreeSet<>(comparatorPerson1);

        set.add(new Person("Ivan","Vroslov",15));
        set.add(new Person("Маша", "Петрова", 23));
        set.add(new Person("Даша", "Сидорова", 34));

        set.forEach(System.out::println);
    }
}
