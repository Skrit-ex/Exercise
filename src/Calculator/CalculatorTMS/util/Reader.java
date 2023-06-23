package Calculator.CalculatorTMS.util.util;

import Calculator.CalculatorTMS.entity.OperationType;
import TeachMeSkills.Exception.OperationNotFoundException;


public interface Reader {

    String readString();

    double readDouble();

    OperationType readOperationType() throws OperationNotFoundException;
}
