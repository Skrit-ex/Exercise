package HomeWork.OOP.Animals;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Animal[] animals = new Animal[3];
        animals [0] = new Dog("Bones and meat", "home");
        animals [1] = new Cat("Milk", "home");
        animals [2] = new Horse("grass", "field");

        for( Animal animal: animals){
            doctor.treatAnimal(animal);
        }
    }

}
