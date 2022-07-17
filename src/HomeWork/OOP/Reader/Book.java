package HomeWork.OOP.Reader;

public class Book {
    String name;
    String avtor;

    public Book(String name, String avtor){
        this.avtor = avtor;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getInfo() {
        return "Book{" +
                "name='" + name + '\'' +
                ", avtor='" + avtor + '\'' +
                '}';
    }

}
