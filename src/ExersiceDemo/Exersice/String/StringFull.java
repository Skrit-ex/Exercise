package ExersiceDemo.Exersice.String;
import java.lang.String;

public class StringFull {
    public static void main(String[] args) {
        strin("I like java!!!");
        //strin ("I like Pyton!!!");
        //strin("I like C++!!!");
    }

    private static void strin(String st){

        System.out.println("* ��������� ������������� �� ������ �� ������ �������");
        System.out.println(st.endsWith("!!!"));
        System.out.println("* ��������� ���������� �� ������ �� ������ �������");
        System.out.println(st.startsWith("I like"));
        System.out.println("* ��������� ������� ������� �������/�������� � ������ ������");
        System.out.println(st.contains("1"));
        System.out.println("* ��������� ������ ������� �� ������� ������� ������� � ������� ��� ��������� � ������ (����������� ������� � ������ ������� ������ �����)");
        System.out.println("(lastIndexOf ����� � ����� ������)");
        System.out.println(st.indexOf("l") + st.lastIndexOf("k"));

        System.out.println("* concat �������� �����");
        System.out.println(st.concat(" more"));
        System.out.println("* �������� ��������� �������� � ������");
        System.out.println(st.replace("I", "You"));
        System.out.println("* toLowerCase ���������� ���� ��������  - toUpperCase ����������");
        System.out.println(st.toLowerCase() + st.toUpperCase());
        System.out.println("* trim  ������� ������� � ������ � � ����� ������");
        System.out.println("     I like java     ".trim());
        System.out.println("* isEmpty ��������� ������ �� ������   isBlank return true �c�� ������ ������ ��� ��������  �������");
        System.out.println("����� join ��������� ������ � ������������� �� ����� ��������� �������� ������� ��� ������� ");
        System.out.println(st.join(",","Java","Keep","Osa"));



    }
}
