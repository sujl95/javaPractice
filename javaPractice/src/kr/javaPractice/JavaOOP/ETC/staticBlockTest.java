package kr.javaPractice.JavaOOP.ETC;

public class staticBlockTest {
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println(ClassTest.a);
    }
}

class ClassTest {
    static int a = 0;
    static {
        System.out.println("ClassTest start");
    }
}
