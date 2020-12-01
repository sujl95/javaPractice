package me.thewing.expert001_01;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car(new AmericaTire());
        System.out.println(car.getTireBrand());

        Car car1 = new Car(new KoreaTire());
        System.out.println(car1.getTireBrand());
    }
}
