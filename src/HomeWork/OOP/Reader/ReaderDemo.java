package HomeWork.OOP.Reader;

public class ReaderDemo {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Ivanow Alex", 156, "Faculet 4", "15.06.99", "5468744");
        Reader reader2 = new Reader("Rudew Ilya", 151, "Faculet 4", "11.02.99", "6419845");
        Reader reader3 = new Reader("Golubev", 111, "Faculet 3", "12.04.99", "15241215");
        Book book1 = new Book("The Last of Moghican", "James Cooper");
        Book book2 = new Book("Jane Eyre", "C.Bronte");
        Book book3 = new Book("Drive", "Levi Klaus");

        Book[] books = {book1, book2, book3};
        Reader []readers ={reader1, reader2,reader3};

        //printReaders(readers);
        //printBooks(books);

        reader1.takeBook(5);
        reader2.takeBook("The Last", "After you");
        reader3.takeBook(book1,book3);

        reader1.returnBook(book2);
        reader2.returnBook(book1);
        reader3.returnBook(book3);




    }
    }

