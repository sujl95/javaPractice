package kr.javaPractice.Practice.DesignPattern.Adapter.Sample1;

public class AdapterServiceB {
    ServiceB b = new ServiceB();

    void runService() {
        b.runServiceB();
    }

}
