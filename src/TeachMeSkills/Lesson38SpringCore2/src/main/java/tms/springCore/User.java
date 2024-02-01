package tms.springCore;


import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Aspect
@Component
@EnableAspectJAutoProxy
public class User {

    private String code;
    private final Dog dog;
    private final Cat cat;

    public User(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }
    public void sayHello(){
        System.out.println("Hello");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return "User{" +
                "code='" + code + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
