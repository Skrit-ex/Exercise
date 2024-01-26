package org.example;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStorage implements OperationStorage{

    List<Operation> operations = new ArrayList<>();


    @Override
    public void save(Operation operation) {
        operations.add(operation);
    }

    @Override
    public List<Operation> findAll() {
        return new ArrayList<>(operations);
    }
}
