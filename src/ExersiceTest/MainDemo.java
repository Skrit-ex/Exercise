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
        ListTovar listTovar = new ListTovar();
        ConsolPrinter consolPrinter = new ConsolPrinter();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("G://Java//BufferedWriter//Catalog1.txt");  //if don't find, delete and create new file
        BufferedReader korzina1 = new BufferedReader(new FileReader("G://Catalog2.txt"));
        Scanner scanner = new Scanner(System.in);
        String beginProgramm;
        DressMarket dressMarket = new DressMarket();
        consolPrinter.print(" Welcome to online clothing store");
        consolPrinter.print(" Can you look catalog clothes ? ");
        consolPrinter.print("Enter yes/no ");
        while (!((beginProgramm = buf.readLine()).equals("yes"))) {
            System.out.println(beginProgramm);
            consolPrinter.print("Termination of the program ");
            buf.close();
        }
        consolPrinter.print("Enter number of catalog: ");
        listTovar.list();

        consolPrinter.print(" If you wish add clothes in box, should sing in account " + '\n');
        user.singInLogin();
        user.singInPassword();

        mainDemo();


        System.out.println("Would you like view a shopping box? ");
        System.out.println("yes / no");
        String korzina = scanner.nextLine();
        while (korzina.isEmpty()) {
            consolPrinter.print("Input error, field is empty, try again");
            korzina = scanner.nextLine();
        }
        if (korzina.equals("yes")) {
            String skr = korzina1.readLine();
            while (skr != null) {
                System.out.println(skr);
                skr = korzina1.readLine();
            }
            } else{
                System.out.println(" Завершение программы");
            }
        }
        public static void mainDemo () throws IOException {
            ConsolPrinter consolPrinter = new ConsolPrinter();
           // ListTovar listTovar = new ListTovar();
            AddTovar addTovar = new AddTovar();
            BufferedReader numberKatalog = new BufferedReader(new InputStreamReader(System.in)), add = new BufferedReader(new InputStreamReader(System.in));
            Basket basket = new Basket();
            addTovar.newTovar();
            String katal = numberKatalog.readLine();
            basket.backTovar(katal);
            consolPrinter.print("Would you like to add items to your shopping box? ");
            consolPrinter.print("yes/no");
            String newTovar = add.readLine();
            while (newTovar.isEmpty()) {
                consolPrinter.print("Input error,field is empty, try again ");
                newTovar = add.readLine();
            }
            while (!(newTovar.equals("yes") || newTovar.equals("no"))) {
                consolPrinter.print("Input error, try again");
                newTovar = add.readLine();
            }
            if (newTovar.equals("yes")) {
                mainDemo();
            }
            return;
        }
    }