package Calculator.Plus;


public class InMemoryOperationStorage implements OperationStorage {
    private int index = 0;

    Operation[] operations = new Operation[10];
    private int countOperations = 0;

    public void save(Operation operation) {
        if (index == operations.length - 1) {
            index = 0;
            operations[index] = operation;
        } else {
            operations[index] = operation;
            index++;
        }
        countOperations++;
    }

    @Override
    public Operation[] findAll() {
        return operations;
    }

    public int getCountOperations() {
        return this.countOperations;
    }
}
