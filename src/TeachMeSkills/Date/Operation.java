package TeachMeSkills.Date;

import java.time.LocalTime;

public class Operation {

    private double num1;

    private double num2;

    private double result;

    private  String type;

    private LocalTime createAt;

    public Operation(double num1, double num2, String type) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
    }

    public LocalTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalTime createAt) {
        this.createAt = createAt;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getResult() {
        return result;
    }

    public String getType() {
        return type;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setType(String type) {
        this.type = type;
    }
}
