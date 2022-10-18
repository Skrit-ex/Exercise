package HomeWork.OOP.Phone;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone1 = new Phone("166494813","Samsung","250");
        Phone phone2 = new Phone("1658445656", "Apple");
        Phone phone3 = new Phone();

        phone1.receiveCall("Vladimir");
        phone1.receiveCall("Mom", phone1.getNumber());
    }
}
