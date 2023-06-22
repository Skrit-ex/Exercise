package ExersiceDemo.Lambda.Predicate;

import java.util.function.Predicate;
//info
// Predicate     Принимает на вход значение, проверяет состояние и возвращает boolean значение в качестве результата.

public class PredicateAND {
    public static void main(String[] args) {
        Predicate <String> predicate1 = s -> s.contains("a");
        Predicate <String> predicate2 = s -> s.contains("b");

        System.out.println(predicate1.and(predicate2).test("abcd"));

        System.out.println(predicate1.or(predicate2).test("aste"));
    }
}
