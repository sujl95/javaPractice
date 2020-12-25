package kr.javaPractice.Practice.DesignPattern.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        AnimalToy boltBall = bolt.getToy();
        AnimalToy kittyTower = kitty.getToy();

        boltBall.identify();
        kittyTower.identify();
    }
}
