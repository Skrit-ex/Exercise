package Predicate;

import java.util.function.Predicate;

public class Predicatedemo1 {
    public static void main(String[] args) {

//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s!=null;
//            }
//        };

        // используя лямбда выражения
         Predicate<String> predicate = s -> s!= null;

        System.out.println(predicate.test("12"));
        System.out.println(predicate.test(null));
        System.out.println(predicate.test(""));
    }
}
