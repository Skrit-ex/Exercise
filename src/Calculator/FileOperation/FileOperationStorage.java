package Calculator.FileOperation;
import java.io.*;

public class FileOperationStorage {

    public void save(Operation operation) throws IOException {
        File file = new File("G:\\JDK\\src\\Calculator\\FileOperation\\history.csv");
        String result = String.format("%s,%s,%s,%s", operation.getNum1(),operation.getNum2(),
                operation.getResult(), operation.getType());

        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        fileOutputStream.write(result.getBytes());
        fileOutputStream.write(10);
        fileOutputStream.close();
    }

    public Operation[] findAll() throws IOException {
        File file = new File("G:\\JDK\\src\\Calculator\\FileOperation\\history.csv");
        FileReader fileReader = new FileReader(file);

        char [] arr = new char[(int) file.length()];

        fileReader.read(arr);
        System.out.print(arr);
        fileReader.close();
        return null;
    }
}

