package HomeWork.EnumSize;

public class Atel {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(15, 16, "orange");
        Tie tie = new Tie(16, 18, "rose");
        Dress dress = new Dress(18, 46, "Blue");
        Pants pants = new Pants(15, 17, "Black");

        Clothes[] clothes = {tshirt, tie, dress, pants};

        System.out.println("Перечень женской одежды : ");
        Clothes.dressWoman(clothes);
        System.out.println();
        System.out.println("Перечень мужской одежды : ");
        Clothes.dressMan(clothes);



    }
}