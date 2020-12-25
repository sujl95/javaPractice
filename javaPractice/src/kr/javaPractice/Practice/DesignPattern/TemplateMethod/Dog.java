package kr.javaPractice.Practice.DesignPattern.TemplateMethod;

public class Dog extends Animal{
    @Override
    void play() {
        System.out.println("멍멍");
    }

    @Override
    void runSomething() {
        System.out.println("멍멍 멍멍 꼬리 흔들기");
    }
}
