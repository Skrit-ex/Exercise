package Calculator.CalculatorTMS.storage;

import Calculator.CalculatorTMS.entity.Operation;
import Calculator.CalculatorTMS.entity.OperationType;
import Calculator.CalculatorTMS.util.ConsoleWriter;
import Calculator.CalculatorTMS.util.util.Writer;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GsonOperationStorage implements OperationStorage {

    private FileWriter fileWriter;
    List<Operation> operations = new ArrayList<>();
    Writer writer = new ConsoleWriter();
    Gson gson = new Gson();

    public GsonOperationStorage() {
        try {
            fileWriter = new FileWriter
                    ("G:\\JDK\\Exercises\\src\\Calculator\\CalculatorTMS\\storage\\text.json");
        }
        catch (IOException e) {
            writer.writeError("File not found");
        }
    }

    @Override
    public void save(Operation operation) throws IOException {

    }

    @Override
    public void saveList(List<Operation> operations) {
        try {
            for( Operation operation: operations) {
                operations.add(operation);

                String s = gson.toJson(operations.toString());
                fileWriter.write(s);
                fileWriter.write("\n");
                fileWriter.flush();
            }
        } catch (IOException e) {
            writer.writeError("File not found");
        }
    }
    @Override

    // FIXME: 12.07.2023

    public List<Operation> findAll() {
        List<Operation> operationList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader
                    ("G:\\JDK\\Exercises\\src\\Calculator\\CalculatorTMS\\storage\\text.json"));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                operationList.add(convertOperation(line));

                List list1 = gson.fromJson(line, List.class);
                System.out.println(list1);
            }
        } catch (IOException e) {
            writer.writeError("File not found");
        }
        return operationList;
    }

    private Operation convertOperation(String operation) {
        String[] arr = operation.split(",");
        double num1 = Double.parseDouble(arr[0]);
        OperationType operationType = OperationType.valueOf((arr[1]));
        double num2 = Double.parseDouble(arr[2]);
        double result = Double.parseDouble(arr[3]);
        Double time = Double.valueOf(arr[4]);
        return new Operation(num1, operationType, num2, result, time);
    }
}
