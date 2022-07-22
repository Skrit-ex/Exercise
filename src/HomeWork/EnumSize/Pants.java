package HomeWork.EnumSize;

public class Pants extends Clothes implements ManClothing,WomanClothing{

    public Pants(int sizeCloth, double price, String color) {
        super(sizeCloth, price, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
