package Calculator.Plus;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperationStorage implements OperationStorage{
    Writer writer = new ConsoleWriter();
    @Override
    public void save(Operation operation) {
        File file = new File("G:\\JDK\\src\\Calculator\\FileOperation\\history.csv");
        try {
            String result = String.format("%s,%s,%s,%s", operation.getNum1(), operation.getNum2(), operation.getType(),
                    operation.getResult());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(result.getBytes());
            fileOutputStream.write(10);
            fileOutputStream.close();
        }catch (IOException e){
            writer.writeError("File not found");
        }
    }

    @Override
    public List<Operation> findAll() {
        try {
            BufferedReader bufferedReader = new BufferedReader
                    (new FileReader("G:\\JDK\\src\\Calculator\\FileOperation\\history.csv"));

            String line;
            while ((line = bufferedReader.readLine()) != null){
                writer.writeError("" + convertOperation(line));
            }
        }catch (IOException e){
            writer.writeError("File not found");
        }
        return new ArrayList<>();
    }

    private Operation convertOperation(String operation){
        String [] arr = operation.split(",");
        double num1 = Double.parseDouble(arr[0]);
        double num2 = Double.parseDouble(arr[1]);
        double result = Double.parseDouble(arr[2]);
        OperationType operationType = OperationType.valueOf((arr[3]));
        Operation operation1 = new Operation(num1,num2,operationType,result);
        return operation1;
    }
}
