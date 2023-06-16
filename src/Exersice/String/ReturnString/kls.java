package Exersice.String.ReturnString;
import java.util.Scanner;

public class kls {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String text = scanner.nextLine();
        char [] arr = text.toCharArray();    //// Преобразуем строку text в массив символов (char)
        System.out.println("Строка в обраном порядке : ");
         for(int i= arr.length-1; i>=0; i--){
             System.out.print(arr[i]);
         }
         }
}
//        2. C использованием метода StringBuffer(), реверсирует буфер и затем преобразует буфер в String с помощью метода toString().
//        String str = "абвгдеёжзи";
//        String reverse = new StringBuffer(str).reverse().toString();
//        System.out.println("\nСтрока до реверса: " + str);
//        System.out.println("Строка в обратном порядке, после реверса: " + reverse);
//