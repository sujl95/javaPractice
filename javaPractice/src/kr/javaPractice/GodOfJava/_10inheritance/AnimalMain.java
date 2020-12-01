package kr.javaPractice.GodOfJava._10inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class AnimalMain {
    public static void main(String[] args) {
        //인스턴스화
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();

        dog.age();
        cat.age();

    }
}
