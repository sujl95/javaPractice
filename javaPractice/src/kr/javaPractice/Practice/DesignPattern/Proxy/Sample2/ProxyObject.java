package kr.javaPractice.Practice.DesignPattern.Proxy.Sample2;

public class ProxyObject implements Interface{
    Interface anInterface ;
    @Override
    public void operation() {
        anInterface = new RealObject();
        anInterface.operation();
    }
}
