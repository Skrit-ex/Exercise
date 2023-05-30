package Calculator.Plus;

import TeachMeSkills.Exception.OperationNotFoundException;


public interface Reader {

    String readString();

    double readDouble();

    OperationType readOperationType() throws OperationNotFoundException;
}
