package Calculator.Plus;

import java.io.*;

public class FileOperationStorage implements OperationStorage{
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
            System.out.println("File not found");
        }
    }

    @Override
    public Operation[] findAll() {
        Operation [] arr = new Operation[4];
        try {
            BufferedReader bufferedReader = new BufferedReader
                    (new FileReader("G:\\JDK\\src\\Calculator\\FileOperation\\history.csv"));


            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(convertOperation(line));
            }


        }catch (IOException e){
            System.out.println("file not found");
        }
        return arr;
    }

    private Operation convertOperation(String operation){
        String [] arr = operation.split(",");
        double num1 = Double.parseDouble(arr[0]);
        double num2 = Double.parseDouble(arr[1]);
        double result = Double.parseDouble(arr[2]);
        Operat operat = Operat.valueOf((arr[3]));
        Operation operation1 = new Operation(num1,num2,operat,result);
        return operation1;
    }
}
