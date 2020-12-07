package kr.javaPractice.JavaOOP.TMemory;

public class staticTest {
    static int i = 0;

    static {
        System.out.println("staticTest static Create");
    }

    public static void main(String[] args) {

        System.out.println("test");
    }
}
