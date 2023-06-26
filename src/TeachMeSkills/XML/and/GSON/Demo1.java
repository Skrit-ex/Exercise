package TeachMeSkills.XML.and.GSON;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws IOException {

        //1 пример
        Gson gson = new Gson();
        User user1 = new User("Kira","Kira", "kira");
        User user2 = new User("Dima","Dima", "Dima");

        String s1 = gson.toJson(user1);
        String s2 = gson.toJson(user2);

        System.out.println(s1);
        System.out.println(s2);

        // через лист, если передавать массив
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        String s = gson.toJson(users);
        System.out.println(s);
//
//        // если имеются данные gson (можно быстро преобразовать, записав в файл, смотри ниже)
//        List list = gson.fromJson("[{\"name\": \"Alex\",\"username\": \"simon\",\"password\": \"simon\",\"age\": \"23\",\"telephone\": \"164616161\"}," +
//                "{\"name\": \"Alex1\",\"username\": \"simon1\",\"password\": \"simon2\",\"age\": \"24\",\"telephone\": \"16214412161\"}]", List.class);
//
//        System.out.println(list);


//        //Запись в файл
//
//        FileWriter fileWriter = new FileWriter("G:\\JDK\\Exercises\\src\\TeachMeSkills\\XML\\textDemo.json");
//        fileWriter.write(s); //s из примера 1
//        fileWriter.close();


        // чтение из gson
        FileReader fileReader = new FileReader("G:\\JDK\\Exercises\\src\\TeachMeSkills\\XML\\textDemo.json");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s3 = bufferedReader.readLine();
        System.out.println(s3);
        List list1 = gson.fromJson(s3, List.class);
        System.out.println(list1);


//
//        DocumentBuilderFactory doc = DocumentBuilderFactory.newInstance(); //cоздаём фабрику
//        DocumentBuilder documentBuilder = doc.newDocumentBuilder();   // просим у фабрики создать документ
//        Document parse = documentBuilder.parse(new File("G:\\JDK\\Exercises\\src\\TeachMeSkills\\XML\\text.xml")); //парсим документ
//
//        Element documentElement = parse.getDocumentElement();
//        System.out.println(documentElement.getAttributes());
//
//        NodeList users = parse.getElementsByTagName("users");
//        Node item = users.item(0);
//        Node item2 = users.item(1);

    }
}
