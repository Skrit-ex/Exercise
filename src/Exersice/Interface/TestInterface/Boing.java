package Exersice.Interface.TestInterface;

public class Boing extends Aircraft implements VerticalTakeoff{

    @Override
    public void fly() {
        super.fly();
        System.out.println("Aircraft");
    }

    @Override
    public void vzlet() {
        System.out.println("vzlet");

    }
}
