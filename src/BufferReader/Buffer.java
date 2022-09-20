package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader( new InputStreamReader(System.in));
        String stroka;
        System.out.println("Загадка ");
        System.out.println("Одна нога много рук , кто это? ");
        //while (! ((stroka = buf.readLine()).equals("стоп") ||  stroka.equals("дерево"))){
        while (! (stroka= buf.readLine()).equals("дерево")){
            System.out.println("Не правильный ответ, попробуйте ещё раз ");
            System.out.printf("%s", " Для выхода из программы введите 'стоп'  \n");
            if( stroka.equals("стоп")){
                System.out.println("прекращение работы программы");
            }
        }
        System.out.println("Это правильный ответ");
    }
}
