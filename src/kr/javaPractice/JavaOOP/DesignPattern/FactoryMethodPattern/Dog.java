package kr.javaPractice.JavaOOP.DesignPattern.FactoryMethodPattern;

public class Dog extends Animal{
    AnimalToy getToy() {
        return new DogToy();
    }
}
