package Exception;


// создание собственного исключения
public class MyException extends Exception {
    public MyException(String description){
        super(description);
    }
}
