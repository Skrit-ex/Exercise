package TeachMeSkills.LambdaExersice.Calculator.Storage;

import TeachMeSkills.LambdaExersice.Calculator.Operation;

import java.util.List;

public interface Storage {

    void save(double operation);

    List<Operation> findAll();
}
