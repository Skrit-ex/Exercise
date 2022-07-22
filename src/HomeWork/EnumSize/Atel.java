package HomeWork.EnumSize;

public class Atel {
    public static void main(String[] args) {
        Tshirt tshirt =  new Tshirt(15,16,"sda");
        Tie tie = new Tie(16,18, "rose");
        Dress dress = new Dress(18,46,"Blue");
        Pants pants = new Pants(15, 17, "Black");

        Clothes[] clothesWoman = {tshirt,pants,dress};


        Clothes[] clothesMan = {tshirt,pants,tie};

        for( Clothes clothes: clothesMan){
            System.out.println("Man's dress : " + clothes);
            clothes.dressMan(tshirt);
        }

        }


    }
