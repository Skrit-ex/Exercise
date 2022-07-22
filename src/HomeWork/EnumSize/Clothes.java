package HomeWork.EnumSize;

import java.util.Objects;

public class Clothes {
    private int sizeCloth;
    private double price;
    private String color;

    Clothes(int sizeCloth, double price, String color) {
        this.sizeCloth = sizeCloth;
        this.price = price;
        this.color = color;
    }
    public int getSizeCloth() {
        return sizeCloth;
    }

    public void setSizeCloth(int sizeCloth) {
        this.sizeCloth = sizeCloth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void dressWoman(WomanClothing womanClothing){
        System.out.println("Dress Woman");
        womanClothing.dressWoman();
    }
    public void dressMan(ManClothing manClothing){
        System.out.println();

    }
}

