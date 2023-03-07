package TeachMeSkills.ArrayLesson1;

import java.util.Arrays;

public class ArrayChetNeChet {
    public static void main(String[] args) {
        int[] arr = {154, 156, 5, 46, 975, 55, 3, 67, 54};

        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] % 2 ==0){
                n= arr[i];
                System.out.println("Четные числа массива " + n);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2 !=0){
                n= arr[i];
                System.out.println(" Нечетные числа массива " + n);
            }

        }
        Arrays.sort(arr);
    }
}
