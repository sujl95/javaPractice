package kr.javaPractice.Practice.DesignPattern.Proxy.Sample1;

public class NoProxy {
    public static void main(String[] args) {
        //프록시를 사용하지 않은 예제
        Service service = new Service();
        System.out.println(service.runSomething());
    }
}
