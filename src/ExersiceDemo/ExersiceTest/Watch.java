package ExersiceDemo.ExersiceTest;

public class Watch extends Tovar implements  FemaleClothes, MaleClothes{
    public Watch(String price, String color) {
        super(price, color);
    }

    @Override
    public String toString() {
        return "Часы{" +
                " цена = " + getPrice() + " $" +
                ", цвет = " + getColor() +
                "}";
    }
}
