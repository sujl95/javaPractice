package kr.javaPractice.Practice.DesignPattern.Decorator;

public class Service implements IService{
    @Override
    public String runSomething() {
        return "Service";
    }
}
