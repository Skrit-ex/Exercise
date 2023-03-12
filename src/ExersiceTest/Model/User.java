package ExersiceTest.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
    BufferedReader userLogin = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader userPassword = new BufferedReader(new InputStreamReader(System.in));
    private String login;
    private String password;


    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password.charAt(0) + "********";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String singInLogin() {
        try {
            System.out.println("Enter your login");
            login = userLogin.readLine();
            if(login.isEmpty()){
                System.out.println("The field empty, try again ");
                login= singInLogin();
            }
        } catch (IOException e) {
            System.out.println("You introduced an error, try again ");
            login= singInLogin();

        }
        return login;
    }
    public String singInPassword(){
        try{
            System.out.println("Enter your password ");
            password = userPassword.readLine();
            if(password.isEmpty()){
                System.out.println("Field is empty, try again ");
                password= singInPassword();
            }
            if(password.length()<8){
                System.out.println("Eror, minimum number of characters - 8, try again");
                password= singInPassword();
            }

        }catch (IOException e){
            System.out.println("You introduced an error, try again");
            password= singInPassword();
        }
        return password;
    }

}
