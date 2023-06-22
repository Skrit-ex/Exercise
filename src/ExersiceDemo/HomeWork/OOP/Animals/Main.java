package ExersiceDemo.HomeWork.OOP.Animals;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Animal[] animals = new Animal[3];
        animals [0] = new Dog("meat" , "home");
        animals [1] = new Cat("milk", "home");
        animals [2] = new Horse("grass", "field");

        for( Animal animal: animals){
            System.out.println(" на приём идёт " + animal );
            //doctor.treatAnimal(animal);
        }
    }

}
