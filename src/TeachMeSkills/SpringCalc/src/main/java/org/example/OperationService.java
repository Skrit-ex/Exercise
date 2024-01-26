package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OperationService {

   // private final OperationStorage storage = new InMemoryStorage();

    private final OperationStorage operationStorage;

    public OperationService(OperationStorage operationStorage) {
        this.operationStorage = operationStorage;
    }


    Optional<Operation> calculate(Operation operation){
        switch (operation.getType()){
            case"sum":
                operation.setResult(operation.getNum1()+operation.getNum2());
                operationStorage.save(operation);
                return Optional.of(operation);
            case "sub":
                operation.setResult(operation.getNum1()-operation.getNum2());
                operationStorage.save(operation);
                return Optional.of(operation);
            case "mul":
                operation.setResult(operation.getNum1()*operation.getNum2());
                operationStorage.save(operation);
                return Optional.of(operation);
            case "div":
                operation.setResult(operation.getNum1()/operation.getNum2());
                operationStorage.save(operation);
                return Optional.of(operation);
        }
        return Optional.empty();
    }
}
