package ExersiceTest;

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

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader korzina1 = new BufferedReader(new FileReader("G:/Catalog.txt"));
        Scanner scanner = new Scanner(System.in);
        String korzinaTovarov;
        String dobavTovar;
        String beginProgramm;
        String katalog;
        String katal;
        String bask;
        DressMarket dressMarket = new DressMarket();
        System.out.println(" Вы желаете просмотреть каталог одежды? ");
        System.out.println("Введите : да/нет");
        while (!((beginProgramm = buf.readLine()).equals("да"))) {
            System.out.println(beginProgramm);
            System.out.println("прекращение работы программы ");
            buf.close();
        }
        System.out.println("Вы желаете просмотреть 1. Мужской каталог одежды или " +
                "2. Женский каталог одежды");
        System.out.println("Введите номер каталога: ");
        katalog = buf1.readLine();
        while (!((katalog.equals("1")) || (katalog.equals("2")))) {
            System.out.println(" Вы ввели неверный номер каталога, попробуйте ещё раз");
            katalog = buf1.readLine();
        }
        if (katalog.equals("1")) {
            System.out.println("Мужской каталог одежды ");
            dressMarket.dressMale(tovars);
        }
        if (katalog.equals("2")) {
            System.out.println("Женский каталог одежды ");
            dressMarket.dressFemale(tovars);
        }
        System.out.println(" Чтобы добавить товары в корзину, необходимо войти в аккаунт: ");

        BufferedReader users = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader password = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader basket = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader tov = new BufferedReader(new InputStreamReader(System.in));
        User user = new User();
        System.out.println("Input Login : ");
        user.setLogin(users.readLine());
        System.out.println("Input Password ");
        user.setPassword(password.readLine());

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
        if (korzina.equals("да")){
            korzinaTovarov=korzina1.readLine();
            System.out.println(korzinaTovarov);
        }
        else {
            System.out.println(" Завершение программы");
        }
    }
}