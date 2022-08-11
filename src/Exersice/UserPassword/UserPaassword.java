package Exersice.UserPassword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class UserPaassword {
    private String user;
    private String password;

    public UserPaassword(){
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password.charAt(0) +"*****";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
