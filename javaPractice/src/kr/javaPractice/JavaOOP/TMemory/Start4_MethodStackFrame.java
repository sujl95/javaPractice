package kr.javaPractice.JavaOOP.TMemory;

public class Start4_MethodStackFrame {

    public static void main(String[] args) {
        int k = 5;
        int m;

        m = square(k);
        System.out.println(m);
    }

    private static int square(int k) {
        int result;
        k = 25;
        result = k;

        return result;
    }
}
