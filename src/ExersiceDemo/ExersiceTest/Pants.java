package ExersiceDemo.ExersiceTest;

public class Pants extends Tovar implements FemaleClothes, MaleClothes{
    public Pants(Sizes size, String price, String color) {
        super(size, price, color);

    }

    @Override
    public String toString() {
        return "Штаны{" +
                "размер = " + getSize() +
                ", цена = " + getPrice() + " $" +
                ", цвет = " + getColor() +
                "}";
    }
}
