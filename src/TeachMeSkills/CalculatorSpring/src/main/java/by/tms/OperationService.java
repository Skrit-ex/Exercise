package by.tms;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OperationService {

    private final List<Operation> operations = new ArrayList<>();

    public void save(Operation operation){
        operations.add(operation);
    }
}
