package kr.javaPractice.GodOfJava._33Java8Changed;

import java.util.function.Predicate;

public class CalculateSample{

    public static void main(String[] args) {
        Predicate<String> predicateLength5 = (a) -> a.length()>5;
        Predicate<String> predicateContains = (a) -> a.contains("God");
        Predicate<String> predicateStart = (a) -> a.startsWith("God");
    }

    private static void calculateClassic() {
        Calculate calculateAdd = (a, b) -> a+b;
        System.out.println(calculateAdd.operation(1,2));
    }

    private static void calculateLambda() {
        Calculate calculateAdd = (a, b) -> a+b;
        System.out.println(calculateAdd.operation(1,2));
        Calculate calculateSubtract = (a, b) -> a - b;
        System.out.println(calculateSubtract.operation(1,2));
    }

    private static void runCommonThread() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        new Thread(runnable).start();
    }

    private static void runThread() {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
    }

    private static void runThreadSimple() {
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }

}
