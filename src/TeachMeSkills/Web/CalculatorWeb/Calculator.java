package TeachMeSkills.Web.CalculatorWeb;

import java.util.Optional;

public class Calculator {

    public Optional<Operation> calculate(Operation operation){
        return switch (operation.getType()) {
            case "sum" -> Optional.ofNullable(operation.setResult(operation.getNum1() + operation.getNum2()));
            case "sub" -> Optional.ofNullable(operation.setResult(operation.getNum1() - operation.getNum2()));
            case "mul" -> Optional.ofNullable(operation.setResult(operation.getNum1() * operation.getNum2()));
            case "div" -> Optional.ofNullable(operation.setResult(operation.getNum1() / operation.getNum2()));
            default -> Optional.empty();
        };
    }
    }
