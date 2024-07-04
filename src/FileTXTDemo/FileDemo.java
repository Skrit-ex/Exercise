package FileTXTDemo;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDemo {
    static Gson gson = new Gson();

    public static void main(String[] args) throws IOException {


        try {
            File file = new File("G:\\JDK\\Exercises\\src\\FileTXTDemo\\file.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            writer.write("dawdawfaw");
            writer.write(10);
            writer.write("dawdawd");
            writer.close();
        } catch (IOException e) {
            System.err.println(" File not found");
        }

        List<String>strings = new ArrayList<>();
        strings.add("adawd1");
        strings.add("adawd2");
        strings.add("adawd3");
        strings.add("adawd4");
        strings.add("adawd5");
        String s = gson.toJson(strings);
        FileWriter writer = new FileWriter("G:\\JDK\\Exercises\\src\\FileTXTDemo\\fileg.json");
        writer.write(s);
        writer.flush();
        ste();
    }

    public static void ste() throws IOException {
        FileReader fileReader = new FileReader("G:\\JDK\\Exercises\\src\\FileTXTDemo\\fileg.json");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s3 = bufferedReader.readLine();
        List list1 = gson.fromJson(s3, List.class);
        System.out.println(list1);
    }
}