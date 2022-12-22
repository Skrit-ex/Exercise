package WrideToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test");

        //Обработка исключения через try/catch
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.println("Используя обработку исключения try/catch ");
            writer.println("print row 1");
            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        //Обработка через исключение FileNotException
//        PrintWriter writer = new PrintWriter(file);
//        writer.println("Используя обработку исключения try/catch ");
//        writer.println("Test row 1");
//        writer.println("Test row 2");
//        writer.close();
    }
}
