package TeachMeSkills.File;

import java.io.*;
import java.util.Arrays;


public class DemoFile1 {
    public static void main(String[] args) throws IOException {

        File file = new File("G:\\JDK\\src\\TeachMeSkills\\File\\text.txt");

        InputStream fis = new FileInputStream(file);

        byte [] i = new byte[500];
        int read = fis.read(i);
        System.out.println(Arrays.toString(i));
        System.out.print((char) read);
        fis.close();
    }
}
