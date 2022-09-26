package ExersiceTest;

public class DressMarket {
    public void dressMale(Tovar[] tovars){
        System.out.println("мужская одежда в наличии : ");
        for (Tovar tovar : tovars){
            if( tovar instanceof MaleClothes){
                System.out.println(tovar);
            }
        }
    }
    public void dressFemale(Tovar[] tovars){
        System.out.println("Женская одежда : ");
        int i=1;
        for ( Tovar tovar: tovars){
            if(tovar instanceof FemaleClothes) {
                System.out.print(i+". ");
                    System.out.println(tovar);
                    i++;

            }
        }
    }
}
