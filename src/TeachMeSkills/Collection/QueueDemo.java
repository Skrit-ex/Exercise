package TeachMeSkills.Collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        //Одностороняя очередь

        Queue<String> a = new ArrayDeque<>();

        a.add("Hello1");
        a.add("Hello2");
        a.add("Hello3");
        a.add("Hello4");

        System.out.println(a.peek()); //  peek показывает, но не удаляет с очереди
        System.out.println(a.peek());
        System.out.println(a.peek());

        System.out.println(a.poll());  //  poll показывает и удаляет с очереди
        System.out.println(a.poll());
        System.out.println(a.poll());
    }
}
