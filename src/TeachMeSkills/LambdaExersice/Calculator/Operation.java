package TeachMeSkills.LambdaExersice.Calculator;

import java.time.LocalDate;

public class Operation implements Comparable<Operation>{

    private double num1;
    private double num2;
    private double result;
    private OperationType type;
    private LocalDate time;

    public Operation(double num1, double num2, OperationType type) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
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

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public double getNum1() {
        return num1;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", result=" + result +
                ", type=" + type +
                ", time=" + time +
                '}';
    }

    @Override
    public int compareTo(Operation o) {
        if(this.getNum1() > o.getNum1()){
            return 1;
        }else if (this.getNum1() < o.getNum1()){
            return -1;
        }
        return 0;
    }
}
