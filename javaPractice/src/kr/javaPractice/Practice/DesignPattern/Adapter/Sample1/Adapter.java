package kr.javaPractice.Practice.DesignPattern.Adapter.Sample1;

public class Adapter {

    public static void main(String[] args) {
        AdapterServiceA a = new AdapterServiceA();
        AdapterServiceB b = new AdapterServiceB();

        a.runService();
        b.runService();
    }
}
