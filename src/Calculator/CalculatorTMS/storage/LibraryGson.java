package Calculator.CalculatorTMS.storage;

import Calculator.CalculatorTMS.entity.Operation;
import Calculator.CalculatorTMS.util.util.ConsoleReader;
import Calculator.CalculatorTMS.util.util.ConsoleWriter;
import Calculator.CalculatorTMS.util.util.Reader;
import Calculator.CalculatorTMS.util.util.Writer;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.util.List;

public class LibraryGson {
    private final Writer writer = new ConsoleWriter();
    private final Gson gson = new Gson();
    private final Reader reader = new ConsoleReader();
    private final ConsoleWriter consoleWriter = new ConsoleWriter();

    public void gsonLibrary(List<Operation> all){
        writer.write("Do you want to see library? [0] - no/  [1] - yes ");
        String answer = reader.readString();
        switch (answer) {
            case "1" ->{
            for (Operation op : all) {
                gson.toJson(op);
            }
        }
            case "0"->
                writer.writeError(" Program terminated");
        }
    }
}
