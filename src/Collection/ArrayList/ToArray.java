package Collection.ArrayList;

import java.util.Arrays;
import java.util.List;

//получение массива из коллекции

public class ToArray {
    public static void main(String[] args) {
        List<String> array = List.of("A","B","C","D","F");

        //1 способ
        //Object [] toArray()- создает массив типа Object и записывает в него значения из вызывающей коллекции
        Object[] objectsArray = array.toArray();
        System.out.println(Arrays.toString(objectsArray));

        //2 способ
        String[] stringArray1 = new String[array.size()];
        array.toArray(stringArray1);
        System.out.println(Arrays.toString(stringArray1));

        //3 способ
        String[] stringArray2 = array.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray2));
    }
}
