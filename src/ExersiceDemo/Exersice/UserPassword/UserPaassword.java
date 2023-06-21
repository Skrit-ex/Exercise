package ExersiceDemo.Exersice.UserPassword;

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
