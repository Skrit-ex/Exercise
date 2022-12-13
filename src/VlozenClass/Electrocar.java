package VlozenClass;

public class Electrocar {
    private int id;

    //вложеный нестатический класс
    private class Motor{
        public void startMotor(){
            System.out.println("Starting motor ...");
        }
    }
    // статический вложеный класс
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging");

        }
    }
    public Electrocar(int id){
        this.id =id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();

        System.out.println("Electrocar " + id + " starting ...");
    }
}
