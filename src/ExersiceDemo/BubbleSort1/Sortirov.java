package ExersiceDemo.BubbleSort1;

import java.util.Arrays;

public class Sortirov {
    public static void main(String[] args) {
        int [] [] data = {
                {},
                {1, 21, 32, 4, 5},
                {15, 5, 45, 6, 8},
                {55, 25, 64, 56, 23, 33},
        };
        for (int [] element : data){
            System.out.print(Arrays.toString(element) + " реверс ==> ");
            BubbleSort.sort(element);
            System.out.println(Arrays.toString(element));


        }
    }
}
