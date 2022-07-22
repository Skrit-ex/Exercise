package HomeWork.EnumSize;

public class Tshirt extends Clothes implements ManClothing,WomanClothing{

    public Tshirt(int sizeCloth, double price, String color) {
        super(sizeCloth, price, color);

    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
