package ExersiceDemo.ExersiceTest;

import java.io.*;

public class Basket {
    public  void backTovar(String katal) throws IOException {
        File file = new File("G:/Catalog2.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("G:/Catalog2.txt", true));
        String mes = switch (katal) {
            case "1" -> "Товар Штаны (чёрного цвета) добавлен в корзину " + '\n';
            case "2" -> "Товар Штаны (желтого цвета) добавлен в корзину ";
            case "3" -> "Товар Рубашка (белого цвета) добавлен в корзину";
            case "4" -> "Товар Рубашка (чёрного цвета) добавлен в корзину";
            case "5" -> "Товар Галстук (розового цвета) добавлен в корзину";
            case "6" -> "Товар Галстук (чёрного цвета) добавлен в корзину";
            case "7" -> "Товар Часы (белого цвета) добавлен в корзину";
            case "8" -> "Товар Часы (серого цвета) добавлен в корзину";
            default -> "Неизвестный товар : " + katal;
        };
        System.out.println(mes);
        writer.write(mes);
    writer.close();
    }
}
