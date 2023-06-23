package Calculator.CalculatorTMS.validator;

import Calculator.CalculatorTMS.entity.OperationType;

import java.util.regex.Pattern;

public class UserValidator {

    private static final Pattern EMAIL = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    private static final Pattern TYPE = Pattern.compile("[^\\d[.\\d]*$]");
    private  static  final Pattern NUM = Pattern.compile("^(SUM)\\b|(SUB)\\b|(MUL)\\b|(DIV)\\b$");

    public boolean validEmail(String email){
        return EMAIL.matcher(email).matches();
    }

    public boolean validType(String type){
        return TYPE.matcher(type).matches();
    }
    public boolean validNum(String num){
        return NUM.matcher(num).matches();
    }
}
