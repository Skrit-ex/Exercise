package Recursion;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(func(4));
    }

    public static int func(int i) {
        if (i == 1)
            return 1;

        return i * func(i - 1);

    }
}
