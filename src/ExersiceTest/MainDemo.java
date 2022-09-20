package ExersiceTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MainDemo {
    public static void main(String[] args)  throws IOException {
            Tovar [] tovars = {
                    new Pants(Sizes.M, "40", "Black"),
                    new Pants(Sizes.S, "40", "Yellow"),
                    new Shirt(Sizes.M, "55", "White"),
                    new Shirt(Sizes.XL, "55", "Black"),
                    new Tie("58","Rose"),
                    new Tie("60", "Black"),
                    new Watch("70","White"),
                    new Watch("120","Grey")
            };

            DressMarket dressMarket = new DressMarket();
            dressMarket.dressFemale(tovars);
            dressMarket.dressFemale(tovars);


//        BufferedReader users = new BufferedReader( new InputStreamReader(System.in));
//        BufferedReader password = new BufferedReader( new InputStreamReader(System.in));
//        BufferedReader basket = new BufferedReader( new InputStreamReader(System.in));
//        User user = new User();
//        System.out.println("Input Login : ");
//        user.setLogin(users.readLine());
//        System.out.println("Input Password ");
//        user.setPassword(password.readLine());
//        System.out.println("Chose Basket");

    }
}
