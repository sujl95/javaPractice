package kr.javaPractice.GodOfJava._10inheritance;

import java.util.Arrays;

public class InterfaceMain {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.sound();
        Object[] obj = new Object[5];
        int[] intArr = new int[5];
        intArr[0] = 2;
        obj[0] = "str";
        obj[1] = 1;
        obj[2] = intArr;
        obj[3] = true;
        System.out.println(Arrays.toString(obj));
        System.out.println(Arrays.toString((int[]) obj[2]));

    }
}
