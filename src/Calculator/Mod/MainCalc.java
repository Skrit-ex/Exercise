package Calculator.Mod;

public class MainCalc {
    public static void main(String[] args) {

        GetInt getInter = new GetInt();
        GetOperations getOperation = new GetOperations();
        Calculte calculte = new Calculte();

        int num1 = getInter.getInt();
        int num2 = getInter.getInt();
        char operation = getOperation.getChar();
        int result =calculte.calcul(num1,num2,operation);

    }
}
