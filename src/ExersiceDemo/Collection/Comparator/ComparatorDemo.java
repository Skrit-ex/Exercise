package ExersiceDemo.Collection.Comparator;

import ExersiceDemo.Collection.Comparable.Person;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastname().compareTo(o2.getLastname());
    }
}
