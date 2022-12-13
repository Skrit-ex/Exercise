package VlozenClass;

public class Electrocar {
    private int id;

    //вложеный нестатический класс
    private class Motor{
        public void startMotor(){
            System.out.println("Starting motor ...");
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
