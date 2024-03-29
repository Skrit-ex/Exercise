package ExersiceDemo.HomeWork.Consumer;

import ExersiceDemo.HomeWork.OOP.Phone.Phone;

import java.util.function.Consumer;
//info
//Consumer - встроенный функциональный интерфейс, добавленный в Java SE 8 в пакет java.util.function.
//Принимает значение в качестве аргумента и ничего не возвращает:
//Consumer интерфейс используется в случае, если необходимо передать объект на вход и произвести над ним некоторые
// операции не возвращая результат. Самый частый случай использования этого интерфейса - это вывод на консоль.

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Phone> consumer1 = object1 -> System.out.println("Sold  " + object1);
        consumer1.accept(new Phone("13549481","Samsung","250"));
    }
}
