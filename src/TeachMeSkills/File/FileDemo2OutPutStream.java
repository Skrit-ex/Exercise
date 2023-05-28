package TeachMeSkills.File;

import java.io.*;

public class FileDemo2OutPutStream {

    public static void main(String[] args) throws IOException {


        File file = new File("G:\\JDK\\src\\TeachMeSkills\\File\\text1.txt");
        file.createNewFile();

        OutputStream outputStream = new FileOutputStream(file);

        byte [ ] arr = new byte[]{72, 101, 108, 108, 111};
        outputStream.write(arr);
        outputStream.write(10);

        outputStream.write(72);
        outputStream.write(101);
        outputStream.write(108);
        outputStream.write(108);
        outputStream.write(111);

        outputStream.close();
    }
}
