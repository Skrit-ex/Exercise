package TeachMeSkills.File;

import java.io.*;

public class FileDemoCopy {

    public static void main(String[] args) throws IOException {
        File file = new File("G:\\JDK\\src\\TeachMeSkills\\File\\text.txt");
        File file1 = new File("G:\\JDK\\src\\TeachMeSkills\\File\\text1.txt");
        copy(file,file1);
    }
    public static void copy(File fileName1, File fileName2) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);

        while (true){
            int i = fileInputStream.read();
            if(i ==-1) break;
                fileOutputStream.write(i);
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
    }

