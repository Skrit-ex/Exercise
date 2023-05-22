package getInt;

import java.util.Scanner;

public class GetInt {

    private int num;

    public int getInt() {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            num = scanner.nextInt();
        }else{
            System.out.println(" Error, try again ");
            scanner.next();
            num = getInt();
        }
        return num;
    }
}
