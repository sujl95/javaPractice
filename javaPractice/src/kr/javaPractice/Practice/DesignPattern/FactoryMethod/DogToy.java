package kr.javaPractice.Practice.DesignPattern.FactoryMethod;

public class DogToy extends AnimalToy{
    @Override
    void identify() {
        System.out.println("나는 테니스공 댕댕이 친구");
    }
}
