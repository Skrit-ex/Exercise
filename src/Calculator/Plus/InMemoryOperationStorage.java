package Calculator.Plus;

public class InMemoryOperationStorage implements OperationStorage {

    Operation [] operations = new Operation[10];

    public void save(Operation operation) {
        for (int i = 0; i <=10 ; i++) {

        }

    }

    @Override
    public Operation[] findAll() {
        return operations;
    }
}
