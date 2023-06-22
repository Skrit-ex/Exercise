package ExersiceDemo.Lambda.Consumer;

import java.util.function.Consumer;
//info
//Consumer - встроенный функциональный интерфейс, добавленный в Java SE 8 в пакет java.util.function.
//Принимает значение в качестве аргумента и ничего не возвращает:
//Consumer интерфейс используется в случае, если необходимо передать объект на вход и произвести над ним некоторые
// операции не возвращая результат. Самый частый случай использования этого интерфейса - это вывод на консоль.

public class ConsumerDemo1 {
    public static void main(String[] args) {
        Consumer <String> cons = str -> System.out.println(str.toLowerCase());
        cons.accept("HelLO");

        Consumer <String> cons1 = s -> System.out.println(s.toUpperCase());
        cons1.accept("java");
    }
}
