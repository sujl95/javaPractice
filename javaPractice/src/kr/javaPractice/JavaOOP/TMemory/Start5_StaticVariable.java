package kr.javaPractice.JavaOOP.TMemory;

public class Start5_StaticVariable {
    static int share;
    int var = 1;
    public static void main(String[] args) {
        share = 55;
        int k = fun(5, 7);
        System.out.println(share);
        Start5_StaticVariable variable = new Start5_StaticVariable();
        int m = variable.fun1(7, 5);
        variable.var = 5;
        System.out.println(k);
        System.out.println(m);
        System.out.println(variable.var);
    }

    private static int fun(int m, int p) {
        share = m + p;
        return m - p;
    }

    private int fun1(int m, int p) {
        share = m - p;
        return m + p;
    }
}
