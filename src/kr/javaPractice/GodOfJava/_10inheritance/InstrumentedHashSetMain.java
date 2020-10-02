package kr.javaPractice.GodOfJava._10inheritance;

import java.util.Arrays;

public class InstrumentedHashSetMain {
    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();
        s.addAll(Arrays.asList("apple","banana","grape"));
        System.out.println(s.getAddCount());
    }
}
