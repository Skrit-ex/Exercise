package org.example;

import java.util.Optional;

public class OperationService {

    private final OperationStorage storage = new InMemoryStorage();


    Optional<Operation> calculate(Operation operation){
        switch (operation.getType()){
            case"sum":
                operation.setResult(operation.getNum1()+operation.getNum2());
                storage.save(operation);
                return Optional.of(operation);
            case "sub":
                operation.setResult(operation.getNum1()-operation.getNum2());
                storage.save(operation);
                return Optional.of(operation);
            case "mul":
                operation.setResult(operation.getNum1()*operation.getNum2());
                storage.save(operation);
                return Optional.of(operation);
            case "div":
                operation.setResult(operation.getNum1()/operation.getNum2());
                storage.save(operation);
                return Optional.of(operation);
        }
        return Optional.empty();
    }
}
