package tms.SpringCore;

public class User {
    private Dog dog;
    private Cat cat;

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
