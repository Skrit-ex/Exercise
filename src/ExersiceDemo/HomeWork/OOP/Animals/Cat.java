package ExersiceDemo.HomeWork.OOP.Animals;

public class Cat extends Animal {

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void setFood(String food) {
        super.setFood(food);
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
