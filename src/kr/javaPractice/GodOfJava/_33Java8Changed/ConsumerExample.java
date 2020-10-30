package kr.javaPractice.GodOfJava._33Java8Changed;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        consumerExamples();
    }

    private static void consumerExamples() {
        final Consumer<String> print = value -> System.out.println(value);
        print.accept("Hello");

        final Consumer<String> greetings = value -> System.out.println("Hello " + value);
        greetings.accept("World");
        greetings.accept("Kevin");
    }
}
