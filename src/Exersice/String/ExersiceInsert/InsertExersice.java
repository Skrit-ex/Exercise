package Exersice.String.ExersiceInsert;

public class InsertExersice {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = createSomeString(3,56);
        System.out.println(stringBuilder1);
        modifySomeString(stringBuilder1);
        System.out.println(stringBuilder1);

    }
    private static StringBuilder createSomeString( int a, int b){
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");
        result.append(a).append(" * ").append(b).append(" = ").append(a*b).append("\n");
        result.append(b).append(" / ").append(a).append(" = ").append(b/a).append("\n");
        return result ;
    }
    private static StringBuilder modifySomeString(StringBuilder stringBuilder){
        int pos;                                                     //int pos = stringBuilder.indexOf("=");
        while (( pos = stringBuilder.indexOf("=")) != -1) {          // -1 признак того, что "=" в данной строке уже нет
            stringBuilder.deleteCharAt(pos);
            stringBuilder.insert(pos,"равно");  // ctrl+ alt+T
        }
        return stringBuilder;


}
}
