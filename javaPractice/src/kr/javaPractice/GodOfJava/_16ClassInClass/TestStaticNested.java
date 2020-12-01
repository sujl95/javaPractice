package kr.javaPractice.GodOfJava._16ClassInClass;

public class TestStaticNested {
    public static void main(String[] args) {
        System.out.println(StaticNested.StaticNested1.value);
//        System.out.println(StaticNested.Inner.value);
        System.out.println();

        StaticNested.Inner sample2 = new StaticNested().new Inner();

        System.out.println(sample2.getValue());
    }
}
