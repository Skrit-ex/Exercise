package Calculator.Plus;


public class Calculator {

    Operation calculate(Operation operation) {
        switch (operation.getType()) {
            case SUM -> {
                operation.setResult( operation.getNum1() + operation.getNum2());
                return operation;
            }
            case SUB -> {
                operation.setResult( operation.getNum1() - operation.getNum2());
                return operation;
            }
            case MUL -> {
                operation.setResult( operation.getNum1() * operation.getNum2());
                return operation;
            }
            case DIV -> {
                operation.setResult( operation.getNum1() / operation.getNum2());
                return operation;
            }
            default -> throw new IllegalStateException("Inputted error, try again");
        }
    }
}
