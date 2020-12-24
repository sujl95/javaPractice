package kr.javaPractice.Practice.DesignPattern.Adapter.Sample1;

public class NoAdapter {

    public static void main(String[] args) {
        ServiceA a = new ServiceA();
        ServiceB b = new ServiceB();

        a.runServiceA();
        b.runServiceB();

    }
}
