package TeachMeSkills.StringBuilder;

public class Strin {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Hello");

        stringBuilder.append(" ").append("World").append("!");

        stringBuilder.insert(0, "AS ");

        String s = stringBuilder.toString();

        System.out.println(s);
    }
}
