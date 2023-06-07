package TeachMeSkills.Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {

        //Двухсторонняя очередь

        Deque<String> a = new ArrayDeque<>();
        a.addLast("Hello 1");
        a.addLast("Hello 2");
        a.addLast("Hello 3");
        a.addLast("Hello 4");
        a.addFirst("Hello 0");

        System.out.println(a);
    }
}
