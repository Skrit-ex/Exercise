package Exersice.Interface.TestInterface;

public class Mi8 extends Helicopter implements VerticalTakeoff{
    @Override
    public void fly() {
        super.fly();
        System.out.println("Helicopter will vertical");
    }

    @Override
    public void vzlet() {

    }
}
