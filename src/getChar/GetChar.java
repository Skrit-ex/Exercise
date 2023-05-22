package getChar;

import java.util.Scanner;

public class GetChar {

    public char getChar(){
        Scanner scanner = new Scanner(System.in);
        char k;
        System.out.println("Input symbol");
        if(scanner.hasNext()){
            k = scanner.next().charAt(0);
        }else {
            System.out.println("Input error, try again");
            scanner.next();
            k = getChar();
        }
        return k;
    }
}
