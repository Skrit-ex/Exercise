package HomeWork.EnumSize;

public class Clothes  {
    private final int euroSize;
    private int price;
    private String color;


    Clothes(int price, int euroSize, String color) {
        this.price = price;
        this.color = color;
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public static void dressWoman(Clothes [] clothes){
        for(Clothes clothes1: clothes ){
            if( clothes1 instanceof WomanClothing){
                ((WomanClothing) clothes1).dressWoman();
            }
        }
    }
    public static void dressMan(Clothes [] clothes){
        for (Clothes clothesMAN: clothes){
            if( clothesMAN instanceof ManClothing){
                ((ManClothing) clothesMAN).dressMan();
            }
        }
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "euroSize=" + euroSize +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

