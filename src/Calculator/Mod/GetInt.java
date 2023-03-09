package Calculator.Mod;

import java.util.Scanner;

public class GetInt {

    Scanner scanner = new Scanner(System.in);

    public int getInt(){
        int num;
        System.out.println(" Input number ");
        if( scanner.hasNext()){
             num = scanner.nextInt();
        }else {
            System.out.println(" Input error, try again ");
            scanner.next();
            num = getInt();
        }
        return num;
    }
}
