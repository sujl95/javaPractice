package kr.javaPractice.Practice.DesignPattern.Decorator.Sample2;

public class Decorator implements IService {
    Service service;

    @Override
    public String run() {
        service = new Service();
        return "ADD "+service.run();
    }
}
