package kr.javaPractice.GodOfJava.function;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<String, Integer> f = str -> Integer.parseInt(str);
        Integer result = f.apply("1");
        System.out.println(f.apply("123"));
        System.out.println(result);

    }
}
