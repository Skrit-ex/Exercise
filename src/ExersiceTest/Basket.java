package ExersiceTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Basket {
    public  void backTovar(String katal) throws IOException {
        File file = new File("G:/Catalog.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter("G:/Catalog.txt"));
        String mes = switch (katal) {
            case "1" -> "Товар Штаны (чёрного цвета) добавлен в корзину";
            case "2" -> "Товар Штаны (желтого цвета) добавлен в корзину";
            case "3" -> "Товар Майка (белого цвета) добавлен в корзину";
            case "4" -> "Товар Майка (чёрного цвета) добавлен в корзину";
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
