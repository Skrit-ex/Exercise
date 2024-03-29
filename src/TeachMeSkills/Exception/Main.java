package TeachMeSkills.Exception;

public class Main {

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        try {
            TypeOperation typeOperation = consoleReader.readOperationType();
        }catch (OperationNotFoundException e) {
            System.out.println("Operation not found");
        }finally {
            System.out.println("Finally");
        }
        System.out.println("Continue...");
    }
}
