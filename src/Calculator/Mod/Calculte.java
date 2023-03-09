package Calculator.Mod;

public class Calculte {

    public int calcul(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                return result=num1+num2;
            case '-':
                return result=num1-num2;
            case '*':
                return result=num1*num2;
            case  '/':
                return result=num1/num2;
        }
        return 0;
    }
}
