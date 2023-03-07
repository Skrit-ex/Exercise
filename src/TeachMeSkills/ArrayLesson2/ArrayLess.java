package TeachMeSkills.ArrayLesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayLess {
    public static void main(String[] args) {
//        System.out.println("Make array and initializer 0 to 100");
//        metod2();
        metod3();


        System.out.println(" Make array's pyramid");
        int i = 0;
        int j = 0;
        int k = 0;
        int[][] arr = new int[4][5];

        for (j = 0; j < arr.length; j++) {
            for (i = 0; i < j+1; i++) {

                arr[i][j] = k;
                k++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");

        }
    }
    public static void metod2(){
        int k = 0;
        int [] [] arr2 = new int[20][5];
        for(int i =0; i<arr2.length; i++){
            for(int j =0; j<arr2[i].length; j++){
                arr2[i][j]=k;
                k++;
                System.out.print(arr2[i][j] + " ");

            }
            System.out.println( " ");
        }

    }
    public static void metod3() {
        int[][] arr3 = new int[4][5];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (i < j) {
                    arr3[i][j] = 0;
                } else {
                    arr3[i][j] = 1;
                }

            }
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length ; j++) {
                if(j<= i){
                    System.out.print(arr3[i][j]);
                }else {
                    System.out.println(" ");
                }
            }
            
        }
    }
}
