package Calculator.Plus;

import java.util.Arrays;

public class InMemoryOperationStorage implements OperationStorage {

    Operation [] operations = new Operation[10];

    public void save(Operation operation) {
        for (Operation operation1 : operations) {
            System.out.println(operation1);
        }
    }

    @Override
    public Operation[] findAll() {
        return operations;
    }
}
