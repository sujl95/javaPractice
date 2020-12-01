package kr.javaPractice.JavaOOP.DesignPattern.factoryMethodPattern;

public class Dog extends Animal{
    AnimalToy getToy() {
        return new DogToy();
    }
}
