package Calculator.CalculatorTMS.storage;

import Calculator.CalculatorTMS.entity.Operation;
import Calculator.CalculatorTMS.util.util.ConsoleWriter;
import Calculator.CalculatorTMS.util.util.Writer;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GsonOperationStorage implements OperationStorage {
    List<Operation> operations = new ArrayList<>();
    Writer writer = new ConsoleWriter();
    Gson gson = new Gson();
    @Override
    public void save(Operation operation) {
        try {
            FileWriter fileWriter = new FileWriter
                    ("G:\\JDK\\Exercises\\src\\Calculator\\CalculatorTMS\\storage\\text.json");
            operations.add(operation);
            String s = gson.toJson(operations);
            fileWriter.write(s);
            fileWriter.close();
        }catch (IOException e){
            writer.writeError("File not found");
        }
    }
    @Override
    public List<Operation> findAll() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader
                    ("G:\\JDK\\Exercises\\src\\Calculator\\CalculatorTMS\\storage\\text.json"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                gson.fromJson(line, List.class);
            }
        }
        catch (IOException e){
            writer.writeError("File not found");
        }
        return operations;
    }
}
