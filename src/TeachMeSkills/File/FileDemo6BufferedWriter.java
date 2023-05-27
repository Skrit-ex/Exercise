package TeachMeSkills.File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo6BufferedWriter {

    public static void main(String[] args) throws IOException {

        File file = new File("G:\\JDK\\src\\TeachMeSkills\\File\\text1.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        bufferedWriter.write("add row bufferedWriter");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("end.");


        bufferedWriter.close();
    }
}
