package TeachMeSkills.LambdaExersice.Calculator.Storage;

import TeachMeSkills.LambdaExersice.Calculator.Operation;

import java.util.ArrayList;
import java.util.List;

public class OperationStorage implements Storage {

    private final List<Double> operations = new ArrayList<>();

    @Override
    public void save(double operation) {
        operations.add(operation);
    }

    @Override
    public List<Operation> findAll() {
        return new ArrayList<>();
    }
}
