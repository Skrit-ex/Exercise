package Calculator.Plus;

public class ConsoleWriter implements Writer{

    public void write(String message) {
        System.out.println(message);

    }
    public void writeError(String message){
        System.err.println(message);
    }
}
