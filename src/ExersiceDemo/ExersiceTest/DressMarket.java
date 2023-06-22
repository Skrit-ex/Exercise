package ExersiceDemo.ExersiceTest;

public class DressMarket {
    public void dressMale(Tovar[] tovars){
        int i=1;
        System.out.println("Man's clothing : ");
        for (Tovar tovar : tovars){
            if( tovar instanceof MaleClothes){
                System.out.print(i + ".");
                System.out.println(tovar);
                i++;
            }
        }
    }
    public void dressFemale(Tovar[] tovars){
        System.out.println("Woman's clothing : ");
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
