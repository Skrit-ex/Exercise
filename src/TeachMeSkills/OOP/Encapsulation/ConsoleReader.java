package TeachMeSkills.OOP.Encapsulation;

import java.util.Scanner;

public class ConsoleReader {
    private Scanner scanner = new Scanner(System.in);

    public String readString(){
        return scanner.nextLine();
    }

    public double readDouble(){
        return scanner.nextDouble();
    }
}
