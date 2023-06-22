package Calculator.CalculatorTMS.InterfaceModule;

import Calculator.CalculatorTMS.entity.Operation;

import java.io.IOException;
import java.util.List;

public interface OperationStorage {

    void save(Operation operation) throws IOException;

    List<Operation> findAll() throws IOException;
}
