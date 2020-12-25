package kr.javaPractice.Practice.DesignPattern.Strategy;

public class StrategyGun implements Strategy{
    @Override
    public void runStrategy() {
        System.out.println("탕탕탕");
    }
}
