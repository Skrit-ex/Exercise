package HomeWork.String;

import java.util.Locale;

public class BuilderExersice {
    public static void main(String[] args) {
        StringBuilder builder = metodemo(3, 18);
        System.out.println(builder);
        modif(builder);
        System.out.println(builder);
    }
    public static StringBuilder metodemo(int a, int b){
        StringBuilder result = new StringBuilder();
        result.append(a).append("*").append(b).append("=").append(a*b).append("\n");
        result.append(b).append("/").append(a).append("=").append(b/a).append("\n");
        result.append(a).append("+").append(b).append("=").append(a+b).append("\n");
            return result;
        }
        private static StringBuilder modif(StringBuilder stringBuilder){
        int pos;
        while ((pos = stringBuilder.indexOf("="))!=-1) {
           // stringBuilder.deleteCharAt(pos);
          //  stringBuilder.insert(pos, " равно ");
            stringBuilder.replace(pos, pos+1, " равно ");
        }
            return stringBuilder;
        }
}
