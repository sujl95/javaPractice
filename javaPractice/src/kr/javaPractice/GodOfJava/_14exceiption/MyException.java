package kr.javaPractice.GodOfJava._14exceiption;

public class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    public void methodCaller() {
        try {
            methodCaller();
        } catch (Exception e) {
            // 예외처리
        }
    }

    public void methodCallee() {
        // RuntimeException 예외 발생 가능성 있는 부분분
    }
}
