package HomeWork.Collection;

import HomeWork.OOP.Phone.Phone;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();

        phones.add(new Phone("16516654464","Samsung", "110"));
        phones.add(new Phone("6156154561","Apple", "154"));
        phones.add(new Phone("615615454","Xiaomi", "120"));

        System.out.println(phones);

        for(Phone phone: phones){
            System.out.println(phone.getNumber());
        }
        phones.forEach(p -> System.out.println(p.getNumber()) ); //cокращённый метод через consumer
    }
}
