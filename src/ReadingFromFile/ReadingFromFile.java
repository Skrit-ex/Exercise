package ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("G:/JDK/test.txt");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());

        }

       // System.out.println("Вывод строки слов");
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] words = line.split(" ");

            System.out.println(Arrays.toString(words));
        }
       // System.out.println("вывод чисел");
        String line = scanner.nextLine();
        String[] numberString = line.split(" ");
        int [] numbers = new int[3];
        int count = 0;

        for(String number : numberString){
            numbers[count++] = Integer.parseInt(number);
            System.out.println(Arrays.toString(numbers));
        }
    }
}