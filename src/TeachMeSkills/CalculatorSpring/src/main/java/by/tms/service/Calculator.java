package by.tms.service;

import by.tms.Operation;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Calculator {

    public Optional<Operation> calculate(Operation operation){
        switch (operation.getType()){
            case "sum":
                return Optional.ofNullable(operation.setResult(operation.getNum1()+operation.getNum2()));
        }
        return Optional.of(operation);
    }
}
