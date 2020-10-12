package kr.javaPractice;

public class Main {

    public static void main(String[] args) {
        Main.func("2","3");
        Main.func(1,3);
    }
    static void func() {
        System.out.println("매개변수 없음"); // "매개변수 없음"을 출력한다.
    }
    static void func(int i) {
        System.out.println( i ); // i 값을 출력한다.
    }
    static void func(int i, int j) {
        int k = i + j; // i와 j를 더한값을 k에 저장한다.
        System.out.println( k ); // k를 출력한다.
    }
    static void func(String i, String j) {  //추가
        String k = i + j; // i와 j를 더한 문자열 값을 k에 저장한다.
        System.out.println( k ); // k를 출력한다.
    }
}
