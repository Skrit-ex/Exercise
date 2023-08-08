import Calculator.CalculatorTMS.util.ConsoleWriter;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Test {
//    private String x;
//    private String p;
//
//    public Test(String x, String p) {
//        this.x = x;
//        this.p = p;
//    }
//
//    public String getX() {
//        return x;
//    }
//
//    public void setX(String x) {
//        this.x = x;
//    }
//
//    public String getP() {
//        return p;
//    }
//
//    public void setP(String p) {
//        this.p = p;
//    }

    public static void main(String[] args) throws IOException {
        ConsoleWriter consoleWriter = new ConsoleWriter();
        Gson gson = new Gson();

        List<String> all = new ArrayList<>();
        all.add("hbjb");
        all.add("hkjl");
        all.add("klm");



        FileReader fileReader = new FileReader("G:\\JDK\\Exercises\\src\\TeachMeSkills\\XMLandGson\\textDemo.json");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s3 = bufferedReader.readLine();
        List list1 = gson.fromJson(s3, List.class);
        System.out.println(list1);

    }
}

