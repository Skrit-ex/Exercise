package Exersice.Interface.Printable;

public class PrintAbleDemo {
    public static void main(String[] args) {
        Book book = new Book("Last");
        Book book1 = new Book("Oveer");
        Magazine magazine = new Magazine("Kept");
        Magazine magazine1 = new Magazine("List");


        Printable printable1 = new Printable() {
            @Override
            public void print() {
                System.out.println("Printing demo "); //  задание "Вложенные классы"
            }
        };
        Printable[] printables = {book, book1, magazine, magazine1, printable1};
        for (Printable printable : printables) {
            printable.print();


//        Book.printBooks(printables);
//        System.out.println(" ");
//            Magazine.printMagazine(printables);
        }
    }
}
