package Calculator.Plus;


import java.util.ArrayList;
import java.util.List;

public class InMemoryOperationStorage implements OperationStorage {

    private final int index = 0;
    private final List<Operation> operations = new ArrayList<>();

     private final int countOperations = 0;

    public void save(Operation operation) {
       operations.add(operation);
    }

    @Override
    public List<Operation> findAll() {
        return new ArrayList<>(operations);
    }

    public int getCountOperations() {
        return countOperations;
    }
}
