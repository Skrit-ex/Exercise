package ExersiceDemo.Exersice.Wrapper;

public class Wrapper {
    public static void main(String[] args) {
        Integer integer = new Integer("5");
        Integer integer1 = new Integer(5);
        Byte byte1 = new Byte((byte) 5);
        Byte byte2 = new Byte("5");

        Double double1 = Double.valueOf((double) 3);
        Double double2 = Double.valueOf("5");

        Integer integer2 = Integer.valueOf("010101001", 2); // приводит число в двоиную(8-ми, 16-ти) систему исчисления

        System.out.println(integer2);
        System.out.println(integer1);
        System.out.println(integer);
        System.out.println(byte1);
        System.out.println(byte2);
        System.out.println(double1);
        System.out.println(double2);
    }
}
