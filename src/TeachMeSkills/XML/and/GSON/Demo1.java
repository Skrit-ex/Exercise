package TeachMeSkills.XML.and.GSON;

import com.google.gson.Gson;

public class Demo1 {
    public static void main(String[] args){
        Gson gson = new Gson();
        User user1 = new User("Kira","Kira", "kira");
        User user2 = new User("Dima","Dima", "Dima");

        String s1 = gson.toJson(user1);
        String s2 = gson.toJson(user2);

        System.out.println(s1);
        System.out.println(s2);

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
