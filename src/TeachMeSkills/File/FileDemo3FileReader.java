package TeachMeSkills.File;


import java.io.*;

public class FileDemo3FileReader {

    public static void main(String[] args) throws IOException {

        File file = new File("G:\\JDK\\src\\TeachMeSkills\\File\\text.txt");
       Reader reader = new FileReader(file);

        char [] arr = new char[(int) file.length() ];
        reader.read(arr);
        System.out.println(arr);
        reader.close();
    }
}
