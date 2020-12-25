package kr.javaPractice.Practice.DesignPattern.Singleton;

public class Singleton {
    static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
