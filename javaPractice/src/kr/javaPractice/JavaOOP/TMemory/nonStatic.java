package kr.javaPractice.JavaOOP.TMemory;

public class nonStatic {
    int i = 2;
    int i1 = 3;
    public static void main(String[] args) {
        nonStatic nonStatic = new nonStatic();
        nonStatic nonStatic1 = new nonStatic();
        nonStatic nonStatic2 = new nonStatic();
        nonStatic nonStatic3 = new nonStatic();
        System.out.println(nonStatic.i);
        System.out.println(nonStatic1.i1);

    }
}
