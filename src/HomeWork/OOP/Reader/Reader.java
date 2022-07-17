package HomeWork.OOP.Reader;

public class Reader {
    private String fio;
    private int number;
    private String facultet;
    private String dataofBirth;
    private String telefon;

    public void takeBook(int number){
        System.out.println(this.fio + " took " + this.number + " books");

    }

    public void takeBook(String ... books){
        System.out.println(this.fio + " took this books:");
        for(String book: books){
            System.out.println(book);
        }
    }
    public void takeBook(Book ... books){
        System.out.println(this.fio + " took this books");
        for(Book book:books){
            System.out.println(book.name + " avtor " + book.avtor);
        }
    }
    public void returnBook(Book ... books){
        System.out.println(this.fio + " return this book: ");
        for(Book book: books){
            System.out.println(book.name);
        }

    }
    public String getInfo(){
        return "{" +
                "fio='" + fio + '\'' +
                ", kurs='" + facultet + '\'' +
                ", number='" + number + '\'' +
                ", telefon='" + telefon + '\'' +
                ", dataofBirth='" + dataofBirth + '\'' +
                '}';


    }

    public Reader(String fio, int number, String facultet, String dataofBirth, String telefon){
        this.fio = fio;
        this.number = number;
        this.facultet = facultet;
        this.dataofBirth= dataofBirth;
        this.telefon = telefon;
    }

    public String getFio(){
        return fio;
    }
    public void setFio(String fio){
        this.fio = fio;
    }
    public int getNumber(){
        return number;

    }
    public void setNumber(int number){
        this.number= number;
    }
    public String getFacultet(){
        return facultet;
    }
    public void setFacultet(String facultet){
        this.facultet = facultet;

    }
    public String getDataofBirth(){
        return dataofBirth;
    }
    public void setDataofBirth(){
        this.dataofBirth = dataofBirth;

    }
    public String getTelefon(){
        return telefon;

    }
    public void setTelefon(String telefon){
        this.telefon = telefon;
    }
}
