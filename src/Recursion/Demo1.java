package Recursion;

public class Demo1 {
    public static void main(String[] args) {
        someMetod(4);
    }
    public static void someMetod(int n) {
        if (n == 0)
            return;

        System.out.println(n);
            someMetod(n-1);

    }
}
