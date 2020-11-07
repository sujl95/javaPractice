package kr.javaPractice;


import java.util.*;

public class Main {

    public static void main(String[] args)  throws Exception{
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.get(0);
        Integer a = 1;
        Integer a1 = new Integer(2)+new Integer(3);
        System.out.println(a1);
        Integer a2 = 3;

        Integer a3 = a+a1;

        System.out.println(a2.equals(a3));


        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a.equals(a1));
        System.out.println(a*a1*a2);
    }
}
