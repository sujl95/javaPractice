package kr.javaPractice.GodOfJava._21Generic;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();
    }

    public void callWildcardMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        WildcardGeneric<Integer> wildcard1 = new WildcardGeneric<Integer>();
        WildcardGeneric<Object> wildcard2 = new WildcardGeneric<Object>();
        WildcardGeneric<Object> wildcard3 = new WildcardGeneric<Object>();
        wildcard.setWildcard("A");
        wildcard1.setWildcard(1);
        wildcard2.setWildcard(new StringBuilder("123"));
        wildcard3.setWildcard(new WildcardSample());

        wildcardStringMethod(wildcard);
        wildcardStringMethod(wildcard1);
        wildcardStringMethod(wildcard2);
        wildcardStringMethod(wildcard3);
    }

    public void wildcardStringMethod(WildcardGeneric<?> c) {
        Object value = c.getWildcard();
        if (value instanceof String) {
            System.out.println("String");
        } else if (value instanceof Integer) {
            System.out.println("Integer");
        } else if (value instanceof StringBuilder) {
            System.out.println("StringBuilder");
        } else if (value instanceof WildcardSample) {
            System.out.println("WildcardSample");
        }
        System.out.println(value);
    }

}
