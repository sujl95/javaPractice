package kr.javaPractice.Practice.DesignPattern.Proxy.Sample3;

public class Proxy implements IService{
    IService service;

    @Override
    public void run() {
        service = new Service();
        service.run();
    }
}
