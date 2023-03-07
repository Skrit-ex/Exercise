package TeachMeSkills.ArrayLesson1;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int [] arr = new int[8];
        int b = arr [3];
        arr[3] = 14;
        System.out.println(b);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("foreach");
        for( int i: arr){
            System.out.print(i + " ");
        }
    }
}
