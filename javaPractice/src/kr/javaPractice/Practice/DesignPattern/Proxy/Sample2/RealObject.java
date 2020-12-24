package kr.javaPractice.Practice.DesignPattern.Proxy.Sample2;

public class RealObject implements Interface{
    @Override
    public void operation() {
        System.out.println("real");
    }
}
