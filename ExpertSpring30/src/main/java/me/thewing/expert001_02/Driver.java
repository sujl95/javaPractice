package me.thewing.expert001_02;

import me.thewing.expert001_02.AmericaTire;
import me.thewing.expert001_02.Car;
import me.thewing.expert001_02.KoreaTire;

public class Driver {
    public static void main(String[] args) {
        Tire tire = new KoreaTire();

        Car car = new Car(tire);
        System.out.println(car.getTireBrand());
    }
}
