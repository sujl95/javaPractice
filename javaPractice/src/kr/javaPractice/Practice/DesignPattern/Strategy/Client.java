package kr.javaPractice.Practice.DesignPattern.Strategy;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = null;
        Soldier rambo = new Soldier();

        strategy = new StrategyGun();
        rambo.runContext(strategy);

        strategy = new StrategySword();
        rambo.runContext(strategy);

        strategy = new StrategyBow();
        rambo.runContext(strategy);
    }
}
