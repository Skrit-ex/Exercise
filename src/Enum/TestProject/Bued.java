package Enum.TestProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bued {
    public static void main(String[] args) {

        Car[] cars = {Car.AUDI,Car.RENO, Car.VW, Car.BMW, Car.JELLY, Car.SEAT};
//        Car car1 = Car.AUDI;
//        Car car2 = Car.VW;
//        Car car3 = Car.BMW;
//        Car car4 = Car.JELLY;
//        Car car5 = Car.RENO;
//        Car car6 = Car.SEAT;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        for(Car car: cars){
            System.out.println(car.name() + ": Speed " + car.getSpeed()+" Type "+car.getType()+" Consumption "
                    +car.getConsumption());
        }
    }
}
