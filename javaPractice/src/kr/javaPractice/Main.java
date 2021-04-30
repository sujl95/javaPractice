package kr.javaPractice;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main (String[] args){

        A a = new A();
        A ab = new B();
        B b = new B();

        List<A> aList = new ArrayList<>();
        List<B> bList = new ArrayList<>();

        foo(bList);



    }

    public static <T extends A> void foo (List<T> a) {

    }

}

class A {

}

class B extends A{

}