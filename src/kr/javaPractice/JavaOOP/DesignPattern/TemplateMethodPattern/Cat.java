package kr.javaPractice.JavaOOP.DesignPattern.TemplateMethodPattern;

public class Cat extends Animal{

    @Override
    void play() {
        System.out.println("야옹! 야옹!");
    }

    @Override
    // Hook(갈고리 ) 메서드 오버라이딩
    void runSomething() {
        System.out.println("야옹~ 야옹~ 꼬리 살랑 살랑");
    }
}
