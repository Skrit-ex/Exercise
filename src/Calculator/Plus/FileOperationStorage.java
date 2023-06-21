package Calculator.Plus;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class
FileOperationStorage implements OperationStorage{
    Writer writer = new ConsoleWriter();
    @Override
    public void save(Operation operation){
        try {
            File file = new File("G:\\JDK\\Exercises\\src\\Calculator\\history.txt");
            String result = String.format("%s,%s,%s,%s,%s", operation.getNum1(), operation.getType(), operation.getNum2(),
                    operation.getResult() , operation.getTime());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(result.getBytes());
            fileOutputStream.write(10);
            fileOutputStream.close();
        }catch (IOException e){
            writer.writeError("File not found");
        }
    }

    @Override
    public List<Operation> findAll() throws IOException{
        File file = new File("G:\\JDK\\Exercises\\src\\Calculator\\history.txt");
    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            List<Operation> operationList = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                operationList.add(convertOperation(line));
            }
            Stream<Operation> stream = operationList.stream();
            operationList = stream.sorted().collect(Collectors.toList());
            return operationList;
    }

    private Operation convertOperation(String operation){
        String [] arr = operation.split(",");
        double num1 = Double.parseDouble(arr[0]);
        OperationType operationType = OperationType.valueOf((arr[1]));
        double num2 = Double.parseDouble(arr[2]);
        double result = Double.parseDouble(arr[3]);
        Double time = Double.valueOf(arr[4]);
        return new Operation(num1,operationType, num2,result, time);

    }
}
