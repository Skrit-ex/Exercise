package TeachMeSkills.Enum;

public class Calculate {

    Oper calculate(Oper oper) {
        switch (oper.type) {
            case DIV -> {
                oper.result = oper.num1 / oper.num2;
                return oper;
            }
            case MUL -> {
                oper.result = oper.num1 * oper.num2;
                return oper;
            }
            case SUB -> {
                oper.result = oper.num1 - oper.num2;
                return oper;
            }
            case SUM -> {
                oper.result = oper.num1 + oper.num2;
                return oper;
            }
            default -> throw new IllegalStateException("Inputted error");
        }
    }

}
