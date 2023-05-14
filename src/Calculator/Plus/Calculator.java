package Calculator.Plus;


public class Calculator {

    Operation calculate(Operation operation) {
        switch (operation.type) {
            case SUM -> {
                operation.result = operation.num1 + operation.num2;
                return operation;
            }
            case SUB -> {
                operation.result = operation.num1 - operation.num2;
                return operation;
            }
            case MUL -> {
                operation.result = operation.num1 * operation.num2;
                return operation;
            }
            case DIV -> {
                operation.result = operation.num1 / operation.num2;
                return operation;
            }
            default -> throw new IllegalStateException("Inputted error, try again");
        }
    }
}
