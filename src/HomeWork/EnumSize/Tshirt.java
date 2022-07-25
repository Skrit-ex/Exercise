package HomeWork.EnumSize;

public class Tshirt extends Clothes implements ManClothing,WomanClothing{

    public Tshirt(int euroSize, int price, String color) {
        super(euroSize, price, color);

    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
