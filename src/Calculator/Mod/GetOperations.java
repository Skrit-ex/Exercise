package Calculator.Mod;

import java.util.Scanner;

public class GetOperations {
     Scanner scanner = new Scanner(System.in);


     public char getChar(){
     char operation;
     if (scanner.hasNextLine()){
         System.out.println(" Input operation : +, -, *, / ");
         operation = scanner.nextLine().charAt(0);
     }else {

     }
}
