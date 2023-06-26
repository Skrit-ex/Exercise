package TeachMeSkills.XML;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory doc = DocumentBuilderFactory.newInstance(); //cоздаём фабрику
        DocumentBuilder documentBuilder = doc.newDocumentBuilder();   // просим у фабрики создать документ
        Document parse = documentBuilder.parse(new File("G:\\JDK\\Exercises\\src\\TeachMeSkills\\XML\\text.xml")); //парсим документ

        Element documentElement = parse.getDocumentElement();
        System.out.println(documentElement.getAttributes());

        NodeList users = parse.getElementsByTagName("users");
        Node item = users.item(0);
        Node item2 = users.item(1);

    }
}
