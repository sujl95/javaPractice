package kr.javaPractice.Practice.DesignPattern.FactoryMethod;

public class CatToy extends AnimalToy{
    @Override
    void identify() {
        System.out.println("나는 캣타워 냥냥 친구");
    }
}
