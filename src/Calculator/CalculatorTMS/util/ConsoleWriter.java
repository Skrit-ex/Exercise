package Calculator.CalculatorTMS.util;


import Calculator.CalculatorTMS.entity.Operation;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ConsoleWriter implements Calculator.CalculatorTMS.util.util.Writer {
    private final Gson gson = new Gson();
    private FileWriter fileWriter;

    public ConsoleWriter() {
        try {
            fileWriter = new FileWriter
                    ("G:\\JDK\\Exercises\\src\\Calculator\\CalculatorTMS\\storage\\text.json");
        } catch (IOException e) {
            write("File not found");
        }
    }

    public void write(String message) {
        System.out.println(message);

    }

    public void writeError(String message) {
        System.err.println(message);
    }

    public void writeOperationStorage(List<Operation> storage) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd");
        for (Operation operation : storage) {
            if (operation != null) {
                write(operation.getNum1() + " " + operation.getType() + " " + operation.getNum2() + " = "
                        + operation.getResult() + "  Date: " + operation.getTime().format(dateTimeFormatter));
            }
        }
    }
}

//    public void writeOperationGson(List<Operation> all) throws IOException {
//        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd");
//        for (Operation operation : all) {
//            String s = gson.toJson(operation);
//            fileWriter.write(s);
//            fileWriter.write("\n");
//            fileWriter.flush();
//        }
//    }
//}