package HomeWork.Predicate;

import java.util.function.Predicate;
//info
// Predicate     Принимает на вход значение, проверяет состояние и возвращает boolean значение в качестве результата.

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate <String> predicate = s -> s.startsWith("J");
        Predicate <String> predicate1 = s -> s.startsWith("N");
        Predicate <String> predicate2 = s -> s.endsWith("A");

        Predicate<String> predicateTest = predicate.or(predicate1).and(predicate2);
        System.out.println(predicateTest.test("Java"));
        System.out.println(predicateTest.test("JavA"));
        System.out.println(predicateTest.test("Next"));
    }
}