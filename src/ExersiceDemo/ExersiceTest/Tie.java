package ExersiceDemo.ExersiceTest;

public class Tie extends Tovar implements FemaleClothes, MaleClothes {
    public Tie( String price, String color) {
        super(price, color);
    }

    @Override
    public String toString() {
        return "Галстук{" +
                " цена = " + getPrice() + " $" +
                ", цвет = " + getColor() +
                "}";
    }
}
