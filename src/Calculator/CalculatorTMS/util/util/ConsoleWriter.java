package Calculator.CalculatorTMS.util.util;


import Calculator.CalculatorTMS.entity.Operation;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ConsoleWriter implements Calculator.CalculatorTMS.util.util.Writer {
    private final Gson gson = new Gson();

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

//    public void writeOperationGson (List<Operation> all) throws IOException {
//       //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd");
//        FileWriter fileWriter = new FileWriter
//                ("G:\\JDK\\Exercises\\src\\Calculator\\CalculatorTMS\\storage\\text.json");
//                String s = gson.toJson(all);
//                fileWriter.write(s);
//                fileWriter.close();
//            }
//        }
