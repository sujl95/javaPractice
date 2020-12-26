package kr.javaPractice.Practice.DesignPattern.Proxy.Sample3;

public class Service implements IService{
    @Override
    public void run() {
        System.out.println("Service");
    }
}
