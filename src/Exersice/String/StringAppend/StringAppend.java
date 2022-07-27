package Exersice.String.StringAppend;

public class StringAppend {
    public static void main(String[] args) {
StringBuilder stringBuilder1 = createSomeString(3,56);
StringBuilder stringBuilder2 = createSomeString(4,100);
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
    }
        private static StringBuilder createSomeString( int a, int b){
            StringBuilder result = new StringBuilder();
            result.append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");
            result.append(a).append(" * ").append(b).append(" = ").append(a*b).append("\n");
            result.append(b).append(" / ").append(a).append(" = ").append(b/a).append("\n");
            return result ;
        }


}