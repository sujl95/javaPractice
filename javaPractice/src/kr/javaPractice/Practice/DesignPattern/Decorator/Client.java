package kr.javaPractice.Practice.DesignPattern.Decorator;

public class Client {
    public static void main(String[] args) {
        Decorator decorator = new Decorator();
        System.out.println(decorator.runSomething());
    }
}
