package kr.javaPractice.GodOfJava.JVM;

import java.util.Arrays;

class Test implements Runnable{
    @Override
    public void run() {
        System.out.println("Test");
    }
}
public class RuntimeLoading {
    public static void main(String[] args) {
        try {
            if (args.length < 1) {
                System.out.println("사용법: java RuntimeLoading [클래스 이름]");
                System.exit(1);
            }
            Class klass = Class.forName(args[0]);
            Object obj = klass.newInstance();
            Runnable r = (Runnable) obj;
            r.run();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
