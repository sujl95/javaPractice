package kr.javaPractice.JavaOOP.DesignPattern.decoratorPattern;

import kr.javaPractice.JavaOOP.DesignPattern.decoratorPattern.IService;
import kr.javaPractice.JavaOOP.DesignPattern.decoratorPattern.Decorator;

public class ClientWithDecorator {
    public static void main(String[] args) {
        IService decorator = new Decorator();
        System.out.println(decorator.runSomething());

    }
}
