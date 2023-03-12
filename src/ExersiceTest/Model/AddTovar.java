package ExersiceTest.Model;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddTovar {
    String result;
    BufferedReader tov = new BufferedReader(new InputStreamReader(System.in));
    ConsolPrinter consolPrinter = new ConsolPrinter();

    public String newTovar() {
        try {
            System.out.println("You will add items to your shopping box : yes/no");
            result = tov.readLine();
            if (result.isEmpty()) {
                System.out.println(" Field is empty, try enter again");
                result = newTovar();
            } else {
                while (!(result).equals("yes")) {
            consolPrinter.print("Выберете номера товаров, которые желаете добавить в корзину: ");
                }
            }
        } catch (IOException e) {
            System.out.println("Error introduced, try again");
        }
        return result;
   }

}
