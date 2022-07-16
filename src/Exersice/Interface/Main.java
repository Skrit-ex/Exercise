package Exersice.Interface;

public class Main {
    public static void main(String[] args) {
        Mi8 mi8 =  new Mi8();
        Boing boing = new Boing();

        VerticalTakeoff verticalTakeoff = new Mi8();
        VerticalTakeoff verticalTakeoff1 = new Boing();
        verticalTakeoff.vzlet();
    }
}
