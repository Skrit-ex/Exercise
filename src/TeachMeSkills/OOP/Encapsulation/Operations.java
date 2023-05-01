package TeachMeSkills.OOP.Encapsulation;

class Operations {

    private double num1;

    private  double num2;

    private double result;

    private String type;

    public Operations(double num1, double num2, String type) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
    }

    public double getNum1() {
        return num1;
    }
    public double getNum2(){
        return num2;
    }

    public String getType() {
        return type;
    }

    public double getResult() {
        return result;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setResult(double result){
        this.result = result;
    }
}

