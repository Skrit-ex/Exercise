package ExersiceTest.Model;

import ExersiceTest.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListTovar {
    DressMarket dressMarket = new DressMarket();
    ConsolPrinter consolPrinter = new ConsolPrinter();
    String katalog;
    BufferedReader listresult = new BufferedReader(new InputStreamReader(System.in));

    public String list() throws IOException {
        Tovar[] tovars = {
                new Pants(Sizes.M, "40", "Black"),
                new Pants(Sizes.S, "40", "Yellow"),
                new Shirt(Sizes.M, "55", "White"),
                new Shirt(Sizes.XL, "55", "Black"),
                new Tie("58", "Rose"),
                new Tie("60", "Black"),
                new Watch("70", "White"),
                new Watch("120", "Grey")
        };
    }
        public void numberCatakog(String katalog) throws IOException {
        katalog = listresult.readLine();
        while (!((katalog.equals("1")) || (katalog.equals("2")))) {
            consolPrinter.print("You introduced an error, try again ");
            katalog = listresult.readLine();
        }
        if (katalog.equals("1")) {
            consolPrinter.print("Man's clothing catalog  ");
            dressMarket.dressMale(tovars);
        }
        if (katalog.equals("2")) {
            System.out.println("Women's clothing catalog ");
            dressMarket.dressFemale(tovars);
        }
        return katalog;
    }
}
