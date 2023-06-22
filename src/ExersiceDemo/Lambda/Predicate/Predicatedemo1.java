package ExersiceDemo.Lambda.Predicate;

import java.util.function.Predicate;
//info
// Predicate     Принимает на вход значение, проверяет состояние и возвращает boolean значение в качестве результата.

public class Predicatedemo1 {
    public static void main(String[] args) {

//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s!=null;
//            }
//        };

        // используя лямбда выражения
        Predicate<String> predicate = s -> s != null;
        Predicate<String> predicate1 = s -> s.isEmpty();

        System.out.println(predicate.test("12"));
        System.out.println(predicate.test(null));
        System.out.println(predicate.test(""));
        System.out.println(predicate1.test("dawd"));
        System.out.println(predicate1.test("da"));
        System.out.println(predicate1.test(""));
    }
}