package TeachMeSkills.File;

import java.io.*;

public class FileDemo5BufferedReader {

    public static void main(String[] args) throws IOException {

        File file = new File("G:\\JDK\\src\\TeachMeSkills\\File\\text.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        System.out.println(bufferedReader.readLine());

        String line;

        while (( line = bufferedReader.readLine()) != null){ // создавая переменную и проверяя через цикл while до последней строки
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
