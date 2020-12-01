package kr.javaPractice.GodOfJava._20JavaLang;

import java.math.BigInteger;

public class JavaLangNumber {
    public static void main(String[] args) {
        JavaLangNumber sample = new JavaLangNumber();
        sample.unsignedCheck();
    }

    public void numberTypeCheck() {
        String val1 = "3";
        String val2 = "5";
        byte byte1 = Byte.parseByte(val1);
        byte byte2 = Byte.parseByte(val2);
        System.out.println(byte1+byte2);

        Integer refInt1 = Integer.valueOf(val1);
        Integer refInt2 = Integer.valueOf(val2);
        System.out.println(refInt1 + refInt2 + "7");
    }

    public void numberTypeCheck2() {
        Integer refint1;
        refint1 = 100;
        System.out.println(refint1.doubleValue());
    }

    public void numberMinMaxCheck() {
        System.out.println("Byte min="+Byte.MIN_VALUE+" max="+Byte.MAX_VALUE);
        System.out.println("Short min="+Short.MIN_VALUE+" max="+Short.MAX_VALUE);
        System.out.println("Integer min="+Integer.MIN_VALUE+" max="+Integer.MAX_VALUE);
        System.out.println("Long min="+Long.MIN_VALUE+" max="+Long.MAX_VALUE);
        System.out.println("Float min="+Float.MIN_VALUE+" max="+Float.MAX_VALUE);
        System.out.println("Double min="+Double.MIN_VALUE+" max="+Double.MAX_VALUE);
        System.out.println("Character min="+(int)Character.MIN_VALUE+" max="+(int)Character.MAX_VALUE);
        int unsignedInt = Integer.parseUnsignedInt("4294967295");
        System.out.println("unsignedInt = "+Integer.toUnsignedString(unsignedInt));
        long unsignedLong = Long.parseUnsignedLong("17916881237904312345");
        System.out.println("unsignedLong = " + Long.toUnsignedString(unsignedLong));
    }

    public void toBinaryString() {
        System.out.println("Integer BINARY min="+Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println("Integer BINARY max="+Integer.toBinaryString(Integer.MAX_VALUE));

        System.out.println("Integer HEX min="+Integer.toHexString(Integer.MIN_VALUE));
        System.out.println("Integer HEX max="+Integer.toHexString(Integer.MAX_VALUE));

    }

    public void numberMinMaxElapsedCheck() {
        JavaLangNumber numberSample = new JavaLangNumber();
        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        numberSample.numberMinMaxCheck();
        System.out.println("Milli second=" + (System.currentTimeMillis() - startTime));
        System.out.println("Nano second=" + (System.nanoTime() - startNanoTime));
    }

    public void printNull() {
        Object obj = null;
        System.out.println(obj+" is object's value");
    }

    public void unsignedCheck() {
        int i, j;
        i = -1;
        i /= 2;
        System.out.println(Integer.toUnsignedString(i));

        float f = 3.1f;
        boolean b = true;
        char a = 'A';
        System.out.println(f);
    }
}
