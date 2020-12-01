package kr.javaPractice.GodOfJava.ETC;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BigDecimalInteger {
    public static void main(String[] args) {
//        BigDecimalCalc();
//        BigDecimalCasting();
    }

    private static void BigDecimalCalc() {
        BigDecimal bd = new BigDecimal("100000.12345");
        BigDecimal bd1 = new BigDecimal("10000");
        System.out.println("덧셈(+) : "+bd.add(bd1));
        System.out.println("뺄셈(-) : "+bd.subtract(bd1));
        System.out.println("곱셈(*) : "+bd.multiply(bd1));
        System.out.println("나눗셈(/) : "+bd.divide(bd1));
    }

    private static void BigDecimalCasting() {
        BigDecimal bigDecimal = BigDecimal.valueOf(100000.12345); //double -> BigDecimal

        int int_bigNum = bigDecimal.intValue(); //BigDecimal -> int
        long long_bigNum = bigDecimal.longValue(); //BigDecimal -> long
        float float_bigNum = bigDecimal.floatValue(); //BigDecimal -> float
        double double_bigNum = bigDecimal.doubleValue(); //BigDecimal -> double
        String String_bigNum = bigDecimal.toString(); //BigDecimal -> String
        System.out.println(int_bigNum);
        System.out.println(long_bigNum);
        System.out.println(float_bigNum);
        System.out.println(double_bigNum);
        System.out.println(String_bigNum);
    }
}
