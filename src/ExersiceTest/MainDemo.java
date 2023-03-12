package ExersiceTest;

import ExersiceTest.Model.ConsolPrinter;
import ExersiceTest.Model.User;

import java.io.*;
import java.util.Scanner;

public class MainDemo {
    public static void main(String[] args) throws IOException {
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
        User user = new User();
        ConsolPrinter consolPrinter = new ConsolPrinter();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("G://Java//BufferedWriter//Catalog1.txt");  //if don't find, delete and create new file
        BufferedReader korzina1 = new BufferedReader(new FileReader("G://Java//BufferedWriter//Catalog1.txt"));
        Scanner scanner = new Scanner(System.in);
        String korzinaTovarov, dobavTovar, beginProgramm, katalog, katal, bask;
        DressMarket dressMarket = new DressMarket();
        consolPrinter.print(" Can you look catalog clothes ? ");
        consolPrinter.print("Enter yes/no ");
        while (!((beginProgramm = buf.readLine()).equals("yes"))) {
            System.out.println(beginProgramm);
            consolPrinter.print("Termination of the program ");
            buf.close();
        }
        consolPrinter.print("Can you look : 1. Man's catalog or " +
                "2. Woman's catalog clothes");
        consolPrinter.print("Enter number of catalog: ");
        katalog = buf1.readLine();
        while (!((katalog.equals("1")) || (katalog.equals("2")))) {
            consolPrinter.print("You introduced an error, try again ");
            katalog = buf1.readLine();
        }
        if (katalog.equals("1")) {
            consolPrinter.print("Man's clothing catalog  ");
            dressMarket.dressMale(tovars);
        }
        if (katalog.equals("2")) {
            System.out.println("Women's clothing catalog ");
            dressMarket.dressFemale(tovars);
        }
        consolPrinter.print(" If you wish add clothes in box, should sing in account ");
        user.singInLogin();
        user.singInPassword();
        BufferedReader tov = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Желаете добавит товары в корзину? ");
        while (((dobavTovar = scanner.nextLine()).equals("да"))) {

            System.out.println("Выберете номера товаров, которые желаете добавить в корзину: ");
            System.out.print("Мужская/");
            dressMarket.dressFemale(tovars);

            Basket basket1 = new Basket();
            katal = tov.readLine();
            basket1.backTovar(katal);

            System.out.println("Желате добавить дополнительные товары в корзину? ");
            System.out.println("да / нет");
        }
        System.out.println("Желаете просмотреть корзину с товарами? ");
        System.out.println("да / нет");
        String korzina = scanner.nextLine();
        if (korzina.equals("да")) {
            korzinaTovarov = korzina1.readLine();
            System.out.println(korzinaTovarov);
            korzina1.close();
        } else {
            System.out.println(" Завершение программы");
        }
    }
}