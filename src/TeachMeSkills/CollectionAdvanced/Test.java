package TeachMeSkills.CollectionAdvanced;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        int[] ar = new int[10];
//        ar[0]= 2;
//
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(4);
//
//        List<String>a = new LinkedList<>();


        List<Integer> a1 = new ArrayList<>();
        for(int i=0; i< 100_000_000; i++){
            a1.add(i);
        }

        long start = System.nanoTime();
        Integer integer = a1.get(67_900_900);
        long end = System.nanoTime();
        System.out.println(end-start);


    }
}
