package Calculator.CalculatorTMS.storage;

import Calculator.CalculatorTMS.entity.Operation;

import java.io.IOException;
import java.util.List;

public interface OperationStorage {

    void save(Operation operation) throws IOException;

    void saveList(List<Operation> operations);

    List<Operation> findAll() throws IOException;
}
