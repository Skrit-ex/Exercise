package VlozenClass;

public class MainClass {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(12);
        electrocar.start();

        Electrocar.Battery battery = new Electrocar.Battery();
        battery.charge();
    }
}
