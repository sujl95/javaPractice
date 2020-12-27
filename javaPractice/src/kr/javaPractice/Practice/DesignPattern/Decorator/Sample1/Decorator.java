package kr.javaPractice.Practice.DesignPattern.Decorator.Sample1;

public class Decorator implements IService{
    IService iService;
    @Override
    public String runSomething() {
        iService = new Service();

        return "Decorator " + iService.runSomething();
    }
}
