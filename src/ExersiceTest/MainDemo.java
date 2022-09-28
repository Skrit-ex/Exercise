package ExersiceTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        String xwer;
        String katalog;
        String katal;
        String bask;
        DressMarket dressMarket = new DressMarket();
        System.out.println(" Вы желаете просмотреть каталог одежды? ");
        System.out.println("Введите : да/нет");
        while (!((xwer = buf.readLine()).equals("да"))) {
            System.out.println(xwer);
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

        System.out.println("Выберете номера товаров, которые желаете добавить в корзину: ");
        System.out.print("Мужская/");
        dressMarket.dressFemale(tovars);

        katal = tov.readLine();
       Basket basket1 = new Basket();
        basket1.backTovar(katal);

        System.out.println("Желате добавить дополнительные товары в корзину? ");
        System.out.println("1. да     2. нет");
        bask = basket.readLine();
        while( ! (bask.equals("1")) ) {
            if (bask.equals("2")) {
                System.out.println("Прекращение работы программы ");
                break;
            }
        }


        System.out.println("Желаете просмотреть товары добавленные в корзину");
        bask= basket.readLine();
        while( ! (bask.equals("1")) ) {
            if (bask.equals("2")) {
                System.out.println("Прекращение работы программы ");
                break;
            }
        }
        basket1.backTovar(katal);
    }
}