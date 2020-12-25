package kr.javaPractice.Practice.DesignPattern.FactoryMethod;

public class Cat extends Animal{
    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}
