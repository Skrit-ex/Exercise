package Calculator.Plus;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface OperationStorage {

    void save(Operation operation) throws IOException;

    Operation [] findAll();
}
