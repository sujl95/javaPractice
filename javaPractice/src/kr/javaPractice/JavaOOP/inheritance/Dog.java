package kr.javaPractice.JavaOOP.inheritance;

public class Dog extends Animal {

    static final int i = 2;

    static {
        System.out.println("강아지");
    }

    public String habit;

    public void showHabit() {
        System.out.println("bow! " + habit);
    }

    @Override
    public void showName() {
        System.out.println("dog");
    }

    public void showName(String name) {
        System.out.println(name);
    }
}
