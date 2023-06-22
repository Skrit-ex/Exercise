package ExersiceDemo.Collection.Iterator;

/*
Перебор содержимого коллекции может быть осуществлен двумя способами: c помощью цикла for each и с помощью итератора.
Итератор позволяет осуществлять обход коллекции и при желании удалять избранные элементы. Используется интерфейс
Iterator.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("brady");
        stringList.add("asta");
        stringList.add("breta");
        stringList.add("gevo");
        stringList.add("hery");

        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element + " ");
        }

    }

}
