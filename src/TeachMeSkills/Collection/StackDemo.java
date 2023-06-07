package TeachMeSkills.Collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

                s.push("Hello 1");
                s.push("Hello 2");
                s.push("Hello 3");
                s.push("Hello 4");

        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println(s.peek());

        System.out.println(s.pop());
        System.out.println(s.pop());  //pop принцип работы как и poll
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
