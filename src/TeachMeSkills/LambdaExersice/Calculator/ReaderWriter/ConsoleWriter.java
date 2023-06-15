package TeachMeSkills.LambdaExersice.Calculator.ReaderWriter;

public class ConsoleWriter implements Writer {


    @Override
    public void write(String message) {
        System.out.println(message);

    }

    @Override
    public void writeError(String message) {
        System.err.println(message);
    }

}
