package by.tms.service;
/**
 * Project: CalculatorSpring
 * Author: Skritex
 * Date: 24.02.2024
 */

import by.tms.Operation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OperationService {

    private final List<Operation> operations = new ArrayList<>();

    public void save(Operation operation){
        operations.add(operation);
    }

    public List<Operation> findAll(){
        for(Operation operation: operations){
            System.out.println(operation.getNum1() + " " +operation.getType() + " " + operation.getNum2()+ " = " + operation.getResult());
        }
        return new ArrayList<>();
    }
}
