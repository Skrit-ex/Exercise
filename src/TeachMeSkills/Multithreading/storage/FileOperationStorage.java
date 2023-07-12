package TeachMeSkills.Multithreading.storage;

import TeachMeSkills.Multithreading.entity.Operation;

import java.io.FileWriter;
import java.io.IOException;

public class FileOperationStorage extends Thread{

    private final FileWriter fileWriter;

    public FileOperationStorage() {
        try {
            fileWriter = new FileWriter
                 ("G:\\JDK\\Exercises\\src\\TeachMeSkills\\Multithreading\\storage\\test.txt", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void save(Operation operation){
        try {
            Thread.sleep(5000);
            fileWriter.write(operation.toString());
            fileWriter.write("\n");
            fileWriter.flush();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
