package TeachMeSkills.Multithreading.service;


import TeachMeSkills.Multithreading.entity.Operation;
import TeachMeSkills.Multithreading.storage.FileOperationStorage;

import java.util.Optional;

public class OperationService {
    FileOperationStorage fileOperationStorage = new FileOperationStorage();

    public Optional<Operation> calculate (double num1, double num2, String type){
        switch (type){
            case "sum":
                double v = num1 + num2;
                Operation operation = new Operation(num1,num2,type,v);
                fileOperationStorage.save(operation);
                return Optional.of(operation);
            case "mul":{
                double v1 = num1 * num2;
                Operation operation1 = new Operation(num1,num2,type,v1);
                fileOperationStorage.save(operation1);
                return Optional.of(operation1);
            }
        }
        return Optional.empty();
    }
}
