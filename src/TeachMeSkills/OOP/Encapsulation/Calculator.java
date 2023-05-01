package TeachMeSkills.OOP.Encapsulation;

public class Calculator {

    Operations calculate(Operations operations){
        switch (operations.getType()){
            case "sum":
                double result1 = operations.getNum1() + operations.getNum2();
                operations.setResult(result1);
                return operations;
            case "min":
                double result2 = operations.getNum1() - operations.getNum2();
                operations.setResult(result2);
                return operations;
            case "mul":
                double result3 = operations.getNum1() * operations.getNum2();
                operations.setResult(result3);
                return operations;
            case "div":
                double result4 = operations.getNum1() / operations.getNum2();
                operations.setResult(result4);
                return operations;
        }
        return operations;
    }
}
