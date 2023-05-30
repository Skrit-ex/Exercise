package Calculator.Plus;

public class Operation {

    private double num1;

    private double num2;

    private Operat type;

    private double result;

    public Operation(double num1, double num2, Operat type,double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;


    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public Operat getType() {
        return type;
    }

    public void setType(Operat type) {
        this.type = type;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
