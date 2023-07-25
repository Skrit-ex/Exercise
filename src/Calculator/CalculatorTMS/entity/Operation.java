package Calculator.CalculatorTMS.entity;

import java.time.LocalDateTime;

public class Operation {
    public Operation(double num1, double num2, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "num1 = " + num1 +
                ", id = " + id +
                ", num2 = " + num2 +
                ", type = '" + type + '\'' +
                ", result = " + result +
                ", time = " + time +
                '}';
    }

    public Operation(double num1, double num2, OperationType type, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
        this.result = result;
    }

    public Operation( double id,double num1, double num2, OperationType type, double result, LocalDateTime time) {
        this.num1 = num1;
        this.id = id;
        this.num2 = num2;
        this.type = type;
        this.result = result;
        this.time = time;
    }

    private double num1;
    private double id;
    private double num2;

    private OperationType type;

    private double result;

    private LocalDateTime time;

    public Operation(double num1, double num2, OperationType type) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
    }
    public Operation(Double num1, OperationType type, Double num2,  double result, Double time) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
        this.result = result;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
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

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public double getResult() {
        return result;
    }

    public Operation setResult(double result) {         //!!!!!!!!!
        this.result = result;
        return this;
    }

}
