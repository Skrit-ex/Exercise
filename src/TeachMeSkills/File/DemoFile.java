package TeachMeSkills.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DemoFile {
    public static void main(String[] args){


        File file = new File("G:\\JDK\\src\\TeachMeSkills\\File\\text.txt");
        //file.createNewFile();
        try {
            InputStream fis = new FileInputStream(file);

            while (true) {
                int i = fis.read(); // метод read считывает 1 символ преобразует в int
                if (i == -1) break;
                    System.out.print((char) i);
            }
            fis.close();

        }catch (IOException e ){
            System.out.println("file not found");
        }
        }
}
