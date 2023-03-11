package ExersiceTest.Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
    BufferedReader userLogin = new BufferedReader( new InputStreamReader(System.in));
    BufferedReader userPassword = new BufferedReader( new InputStreamReader(System.in));
   private String login;
    private String password;

    User(String login, String password){
        this.login = login;
        this.password= password;
    }
    public String getPassword(){
        return password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void singIn(String login,String password){
        try {
        login = userLogin.readLine();
    }catch (IOException e ){
            System.out.println("You write n");
        }
        }
}
