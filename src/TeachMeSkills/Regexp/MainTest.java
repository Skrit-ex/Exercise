package TeachMeSkills.Regexp;

public class MainTest {

    public static void main(String[] args) {

        UserValidator userValidator = new UserValidator();

        boolean b = userValidator.validEmail("klasa@hol.com");
        boolean b1 = userValidator.validEmail("klaasda@holawd.c");

        System.out.println(b);
        System.out.println(b1);
    }
}
