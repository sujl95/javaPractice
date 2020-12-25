package kr.javaPractice.Practice.DesignPattern.TemplateMethod;

public class Cat extends Animal{

    @Override
    void play() {
        System.out.println("야옹");
    }

    @Override
    void runSomething() {
        System.out.println("야옹 야옹 꼬리 흔들기");
    }
}
