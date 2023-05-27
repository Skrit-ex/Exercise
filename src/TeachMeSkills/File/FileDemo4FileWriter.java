package TeachMeSkills.File;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileDemo4FileWriter {

    public static void main(String[] args) throws IOException {

        File file = new File("G:\\JDK\\src\\TeachMeSkills\\File\\text1.txt");
        Writer writer = new FileWriter(file,true);

        writer.write("hello add row");
        writer.write(10); //new row
        writer.append("jew").append(" djakw");
        //writer.close();

        writer.flush();  // flush позволяет добавлять значения в файл не перезаписывая старые, как выполняет это close
    }
}
