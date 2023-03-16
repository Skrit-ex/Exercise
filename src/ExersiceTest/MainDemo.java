package ExersiceTest;

import ExersiceTest.Model.AddTovar;
import ExersiceTest.Model.ConsolPrinter;
import ExersiceTest.Model.ListTovar;
import ExersiceTest.Model.User;

import java.io.*;
import java.util.Scanner;

public class MainDemo {
    public static void main(String[] args) throws IOException {
        User user = new User();
        AddTovar addTovar = new AddTovar();
        Basket basket = new Basket();
        ListTovar listTovar = new ListTovar();
        ConsolPrinter consolPrinter = new ConsolPrinter();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader numberKatalog = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("G://Java//BufferedWriter//Catalog1.txt");  //if don't find, delete and create new file
        BufferedReader korzina1 = new BufferedReader(new FileReader("G://Catalog2.txt"));
        Scanner scanner = new Scanner(System.in);
        String korzinaTovarov, beginProgramm, katal, bask;
        DressMarket dressMarket = new DressMarket();
        consolPrinter.print(" Can you look catalog clothes ? ");
        consolPrinter.print("Enter yes/no ");
        while (!((beginProgramm = buf.readLine()).equals("yes"))) {
            System.out.println(beginProgramm);
            consolPrinter.print("Termination of the program ");
            buf.close();
        }
        consolPrinter.print("Enter number of catalog: ");
        listTovar.list();

        consolPrinter.print(" If you wish add clothes in box, should sing in account ");
        user.singInLogin();
        user.singInPassword();

        consolPrinter.print("List of the catalog ");
        listTovar.list();
        addTovar.newTovar();
        katal = numberKatalog.readLine();
        basket.backTovar(katal);

        System.out.println("Желаете просмотреть корзину с товарами? ");
        System.out.println("да / нет");
        String korzina = scanner.nextLine();
        if (korzina.equals("да")) {
            String skr = korzina1.readLine();
            System.out.println(skr);

        } else {
            System.out.println(" Завершение программы");
        }
    }
}