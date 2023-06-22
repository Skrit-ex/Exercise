package ExersiceDemo.Serialization.ArraySerialization;

import ExersiceDemo.Collection.Comparable.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Read {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int personCount = ois.readInt();
            Person[] people = new Person[personCount];

            for (int i = 0; i < personCount; i++) {
                people[i] = (Person) ois.readObject();
            }
            System.out.println(Arrays.toString(people));

            ois.close();
        }
        catch (IOException e){
            System.out.println("error");
        }
        catch (ClassNotFoundException e){
            System.out.println("Not found class");
        }
    }
}
