package TeachMeSkills.Multithreading.storage;

import TeachMeSkills.Multithreading.entity.Operation;

import java.io.FileWriter;
import java.io.IOException;

public class FileOperationStorage {

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

    }
}
