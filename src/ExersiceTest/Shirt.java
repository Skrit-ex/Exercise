package ExersiceTest;

public class Shirt extends Tovar implements FemaleClothes, MaleClothes{
    public Shirt(Sizes size, String price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Рубашка{" +
                "размер = " + getSize() +
                ", цена = " + getPrice() + " $" +
                ", цвет = " + getColor() +
                "}";
    }
}
