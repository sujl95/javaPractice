package kr.javaPractice.Practice.DesignPattern.TemplateMethod;

public abstract class Animal {
    public void playWithOwner() {
        System.out.println("이리와");
        play();
        runSomething();
        System.out.println("잘했어");
    }

    abstract void play();

    void runSomething() {
        System.out.println("꼬리 흔들기");
    }
}
