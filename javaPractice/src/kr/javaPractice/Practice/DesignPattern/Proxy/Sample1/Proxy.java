package kr.javaPractice.Practice.DesignPattern.Proxy.Sample1;

public class Proxy implements IService{
    IService iService ;
    @Override
    public String runSomething() {
        System.out.println("호출에 대한 흐름 제어가 주목적, 반환 결과를 그대로 전달");
        iService = new Service();
        return iService.runSomething();
    }
}
