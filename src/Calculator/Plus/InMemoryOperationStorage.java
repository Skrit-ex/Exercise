package Calculator.Plus;

public class InMemoryOperationStorage implements OperationStorage {

    Operation [] operations = new Operation[10];

    public void save(Operation operation) {

    }

    @Override
    public Operation[] findAll() {
        return operations;
    }
}
