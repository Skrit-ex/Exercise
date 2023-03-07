package TeachMeSkills.ArrayLesson1;

public class ArrayMaxMin {
    public static void main(String[] args) {

        int[] arr = {154, 156, 5, 46, 975, 55, 3, 67, 54};

        int min = arr[0];
        for (int num : arr){
            if( num < min){
                min= num;
            }
        }
        System.out.println( "Min " + min);

        int max = arr[0];
        for( int num : arr){
            if(num> max){
                max= num;
            }
        }
        System.out.println( "Max" + max);
    }
}
