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
            System.out.println("Would you like to add item to your shopping box? : yes/no");
            result = tov.readLine();
            while (result.isEmpty()) {
                System.out.println(" Field is empty, try enter again");
                result = newTovar();
            }
               if ((result).equals("yes")) {
            consolPrinter.print("Input number goods ");

                }

        } catch (IOException e) {
            System.out.println("Error introduced, try again");
        }
        return result;
   }

}
