package TeachMeSkills.Multithreading.until;

import java.util.Scanner;

public class ConsoleReader {


    public double readDouble(){
        return new Scanner(System.in).nextDouble();

    }

    public String readType(){
        return new Scanner(System.in).next();
    }
}
