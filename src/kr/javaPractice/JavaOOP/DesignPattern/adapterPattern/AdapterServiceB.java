package kr.javaPractice.JavaOOP.DesignPattern.adapterPattern;

public class AdapterServiceB {
    ServiceB sb2 = new ServiceB();
    void runService() {
        sb2.runServiceB();
    }
}
