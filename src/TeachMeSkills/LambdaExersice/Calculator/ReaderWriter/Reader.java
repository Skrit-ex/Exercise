package TeachMeSkills.LambdaExersice.Calculator.ReaderWriter;


import TeachMeSkills.LambdaExersice.Calculator.OperationType;

public interface Reader {

    double readDouble ();

    String readString();

    OperationType readType();

}
