package tms.SpringCore;


import org.springframework.stereotype.Component;

@Component
public class User {
    private final Dog dog;
    private final Cat cat;

    public User(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "User{" +
                "dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
