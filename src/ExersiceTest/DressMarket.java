package ExersiceTest;

public class DressMarket {
    public void dressMale(Tovar[] tovars){
        System.out.println("������� ������ � ������� : ");
        for (Tovar tovar : tovars){
            if( tovar instanceof MaleClothes){
                System.out.println(tovar);
            }
        }
    }
    public void dressFemale(Tovar[] tovars){
        System.out.println("������� ������ : ");
        for ( Tovar tovar: tovars){
            if(tovar instanceof FemaleClothes){
                System.out.println(tovar);
            }
        }
    }
}
