package ExersiceDemo.HomeWork.EnumSize;

public class Pants extends Clothes implements ManClothing,WomanClothing{

    public Pants(int euroSize, int price, String color) {
        super(euroSize, price, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
