package kr.javaPractice.GodOfJava._33Java8Changed;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        functionExamples();
    }

    private static void functionExamples() {

        final Function<String, Integer> toInt = value -> Integer.parseInt(value);

        final Integer number = toInt.apply("100");
        System.out.println(number);

        final Function<Integer, Integer> identity = Function.identity(); // Identity Function
        final Function<Integer, Integer> identity2 = t -> t; // Identity Function

        System.out.println(identity.apply(999));
        System.out.println(identity2.apply(999));
    }
}
