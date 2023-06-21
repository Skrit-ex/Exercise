package ExersiceDemo.HomeWork.OOP.Animals;

import java.util.Objects;

public class Horse extends Animal{
    private  String color;

    public Horse(String food, String location) {
        super(food, location);
    }
    public Horse() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(color, horse.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
