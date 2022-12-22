package Serialization.ArraySerialization;

import Serialization.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Write {
    public static void main(String[] args) {
        Person [] people = {new Person(15, "Bob"), new Person(16, "Max"),
                new Person(164, "Nej")};

        try{
        FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);

            for(Person person: people){
                oos.writeObject(person);
            }

    }
        catch (IOException e){
            System.out.println("file not found or other error");
        }
}
}
