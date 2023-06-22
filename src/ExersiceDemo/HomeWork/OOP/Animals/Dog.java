package ExersiceDemo.HomeWork.OOP.Animals;

public class Dog extends Animal {

    private String color;

    public Dog(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
