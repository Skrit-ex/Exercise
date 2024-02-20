package by.tms.service;

import by.tms.Operation;

import java.util.Optional;

public class Calculator {

    public Optional<Operation> calculate(Operation operation){
        switch (operation.getType()){
            case "sum":
                return Optional.ofNullable(operation.setResult(operation.getNum1()+operation.getNum2()));
        }
        return Optional.of(operation);
    }
}
