package kr.javaPractice.GodOfJava.JVM;

public class HelloWorld1 implements Runnable {
    public void run() {
        System.out.println("안녕하세요, 1");
    }
}
class HelloWorld2 implements Runnable {
    public void run() {
        System.out.println("안녕하세요, 2");
    }
}
