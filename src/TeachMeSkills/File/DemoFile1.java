package TeachMeSkills.File;

import java.io.*;
import java.util.Arrays;


public class DemoFile1 {
    public static void main(String[] args) throws IOException {

        File file = new File("G:\\JDK\\src\\TeachMeSkills\\File\\text.txt");

        InputStream fis = new FileInputStream(file);

        byte [] i = new byte[(int) file.length()];
        int read = fis.read(i);
        System.out.println(Arrays.toString(i));
        System.out.print(read);



        while (true){
            int o = fis.read();
            if( o == -1) break;
            System.out.println((char) o);
        }
        fis.close();
    }
}
