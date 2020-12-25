package kr.javaPractice.Practice.DesignPattern.FactoryMethod;


public class Dog extends Animal{
    @Override
    AnimalToy getToy() {
        return new DogToy();
    }
}
