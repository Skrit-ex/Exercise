package ExersiceTest;

public class Tovar {
    private Sizes size;
    private String price;
    private String color;

    public Tovar(Sizes size, String price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Tovar(String price, String color) {
        this.price = price;
        this.color = color;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tovar" +
                " size='" + size + '\'' +
                ", price='" + price + '\'' +
                ", rating='" + color + '\'' +
                '.';
    }

}
