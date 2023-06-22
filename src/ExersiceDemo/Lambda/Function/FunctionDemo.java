package ExersiceDemo.Lambda.Function;

//Function  - это встроенный функциональный интерфейс
//
//Принимает значение в качестве аргумента одного типа и возвращает другое значение.
// Часто используется для преобразования одного значения в другое

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> function = func -> {
            String result = "zero";
            if (func > 0) {
                result = "positive number";
            } else if (func < 0) {
                result = "negative number";
            }
            return result;
        };
        System.out.println(function.apply(-9));
        System.out.println(function.apply(0));
        System.out.println(function.apply(132));
    }
}
