package HomeWork.String;

public class StrinHomeWork {
    public static void main(String[] args) {
        StringBuilder stringBuilder = Met("Object-oriented programming is" +
                " a programming language model organized around objects rather than" +
                " actions and data rather than logic. Object-oriented programming blabla." +
                " Object-oriented programming bla.");
        System.out.println(stringBuilder);
        Mod(stringBuilder);
        System.out.println(stringBuilder);

    }

    public static StringBuilder Met(String stroka) {
        StringBuilder result = new StringBuilder();
        stroka.replace("Object-oriented programming", "OOP");
        result.append("Преобразование строки ->").append(stroka);
        return result;
    }
    private static StringBuilder Mod(StringBuilder stringBuilder){
        int posit;
        while ((posit = stringBuilder.indexOf("Object-oriented programming")) !=-1){
            stringBuilder.replace(posit, posit+27, "OOP ");
        }
        return stringBuilder;
    }
}