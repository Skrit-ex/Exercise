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
        switch (katal) {
            case "1":
                System.out.println("Товар Штаны (чёрного цвета) добавлен в корзину");
                break;
            case "2":
                System.out.println("Товар Штаны (желтого цвета) добавлен в корзину");
                break;
            case "3":
                System.out.println("Товар Майка (белого цвета) добавлен в корзину");
                break;
            case "4":
                System.out.println("Товар Майка (черного цвета) добавлен в корзину");
                break;
            case "5":
                System.out.println("Товар Галстук (розового цвета) добавлен в корзину");
                break;
            case "6":
                System.out.println("Товар Галстук (чёрного цвета) добавлен в корзину");
                break;
            case "7":
                System.out.println("Товар Часы (белого цвета) добавлен в корзину");
                break;
            case "8":
                System.out.println("Товар Часы (серого цвета) добавлен в корзину");
                break;
        }
        System.out.println("Товары в корзине : ");
        if (katal.equals("1")){
            System.out.println("Штаны размер = M, цена = 40 $, цвет = Black");
        }
        if (katal.equals("2")) {
            System.out.println("Штаны размер = S, цена = 40 $, цвет = Yellow");
        }
        if (katal.equals("3")) {
            System.out.println("Рубашка размер = M, цена = 55 $, цвет = White");
        }
        if (katal.equals("4")) {
            System.out.println("Рубашка размер = XL, цена = 55 $, цвет = Black");
        }
        if (katal.equals("5")) {
            System.out.println("Галстук цена = 58 $, цвет = Rose");
        }
        if (katal.equals("6")) {
            System.out.println("Галстук{ цена = 60 $, цвет = Black");
        }
        if (katal.equals("7")) {
            System.out.println("Часы цена = 70 $, цвет = White");
        }
        if (katal.equals("8")) {
            System.out.println("Часы цена = 120 $, цвет = Grey");
        }
        else {
            System.out.println("выбран не верный номер номер товара");
        }

        System.out.println("Желате добавить дополнительные товары в корзину? ");
        System.out.println("1. да     2. нет");
        bask = basket.readLine();
        while( ! (bask.equals("1")) ) {
            if (bask.equals("2")) {
                System.out.println("Прекращение работы программы ");
                break;
            }
        }
    }
}