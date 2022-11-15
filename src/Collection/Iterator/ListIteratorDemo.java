package Collection.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext());
        String element = listIterator.next();
        listIterator.set(element + " ");

    }
}
