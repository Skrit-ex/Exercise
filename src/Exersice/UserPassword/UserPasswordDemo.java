package Exersice.UserPassword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserPasswordDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        UserPaassword user = new UserPaassword();
        System.out.println("Введите логин:");
        user.setUser(reader.readLine());
        System.out.println("Введите пороль:");
        user.setPassword(reader.readLine());
        System.out.println("Input date : Login    --> " + user.getUser());
        System.out.println("             Password --> " + user.getPassword());


    }

}
