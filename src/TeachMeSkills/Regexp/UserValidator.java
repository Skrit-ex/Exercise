package TeachMeSkills.Regexp;

import java.util.regex.Pattern;

public class UserValidator {

    private static final Pattern EMAIL = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    private static final Pattern PASSWORD = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

    public boolean validEmail(String email){
        return EMAIL.matcher(email).matches();
    }
    public boolean validPassword(String password){
        return PASSWORD.matcher(password).matches();
    }
}
