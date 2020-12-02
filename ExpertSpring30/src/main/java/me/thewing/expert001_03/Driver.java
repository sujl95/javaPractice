package me.thewing.expert001_03;

import me.thewing.expert001_03.Car;
import me.thewing.expert001_03.KoreaTire;
import me.thewing.expert001_03.Tire;

public class Driver {
    public static void main(String[] args) {
        Tire tire = new KoreaTire();
        Car car = new Car();
        car.setTire(tire);


        System.out.println(car.getTireBrand());
    }
}
