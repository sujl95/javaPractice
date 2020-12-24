package kr.javaPractice.Practice.DesignPattern.Adapter.Sample1;

public class AdapterServiceA {
    ServiceA a = new ServiceA();

    void runService() {
        a.runServiceA();
    }
}
