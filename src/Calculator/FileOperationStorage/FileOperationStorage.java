package Calculator.FileOperationStorage;
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
        BufferedReader bufferedReader = new BufferedReader( new FileReader(file));
        String line;

        Operation [] arr = new Operation[3];
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(convertOperation(line));
            //Operation operation = convertOperation(line);

        }

        return arr;
    }

    private Operation convertOperation(String operation){    // конвертация
        String[] st = operation.split(",");
        double num1 = Double.parseDouble(st[0]);
        double num2 = Double.parseDouble(st[1]);
        double result = Double.parseDouble(st[2]);
        Operation operation1 = new Operation(num1,num2,result,st[3]);
        return operation1;
    }
}

