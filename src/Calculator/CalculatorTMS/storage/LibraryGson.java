package Calculator.CalculatorTMS.storage;

import Calculator.CalculatorTMS.entity.Operation;
import Calculator.CalculatorTMS.util.ConsoleReader;
import Calculator.CalculatorTMS.util.ConsoleWriter;
import Calculator.CalculatorTMS.util.util.Reader;
import Calculator.CalculatorTMS.util.util.Writer;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

public class LibraryGson {
    private final Writer writer = new ConsoleWriter();
    private final Gson gson = new Gson();
    private final Reader reader = new ConsoleReader();
    private final ConsoleWriter consoleWriter = new ConsoleWriter();
    private final GsonOperationStorage storage = new GsonOperationStorage();

    public void gsonLibrary(List<Operation> all) throws IOException {
        writer.write("Do you want to see library? [0] - no/  [1] - yes ");
        String answer = reader.readString();
        switch (answer) {
            case "1" -> {
                // consoleWriter.writeOperationGson(all);
                for (Operation operation : all) {
                    storage.save(operation);
                }
                storage.findAll();  // FIXME: 12.07.2023
            }
            case "0"->
                writer.writeError(" Program terminated");
        }
    }
}
