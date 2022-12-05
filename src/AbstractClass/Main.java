package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        cat.makeSound();
        dog.makeSound();
        cat.eat();
        dog.eat();
    }
}
