package kr.javaPractice.GodOfJava._25Thread;

import kr.javaPractice.GodOfJava._10inheritance.Parent;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class MultiThreadSample {
    public static void main(String[] args) throws InterruptedException{
        multiThreadTest();
//        contextLoads();
    }

    private static void multiThreadTest() {
        MultiThreadSample sample = new MultiThreadSample();
        MultiThreadSample sample1 = new MultiThreadSample();
        Thread thread1 = new Thread(() ->{
            System.out.println("thread1 before call " + LocalDateTime.now());
            sample.syncMethod1("from thread1");
            System.out.println("thread1 after call " + LocalDateTime.now());
        });

        Thread thread2 = new Thread(() ->{
            System.out.println("thread2 before call " + LocalDateTime.now());
            sample1.syncMethod1("from thread2");
            System.out.println("thread2 after call " + LocalDateTime.now());
        });

        thread1.start();
        thread2.start();
    }

    private synchronized static void syncMethod1 (String msg) {
        System.out.println("in the syncMethod1 " + msg + " " + LocalDateTime.now());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized static void syncMethod2 (String msg) {
        System.out.println("in the syncMethod2 "+msg+" "+ LocalDateTime.now());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void contextLoads () {
        System.out.println(LocalDateTime.now());
        Thread t1  = new Thread(() -> {
            System.out.println("start1");
            t1("z1");
        });

        Thread t2  = new Thread(() -> {
            System.out.println("start2");
            t1("z2");
        });

        t1.start();
        t2.start();

        while (true) {

        }
    }

    private synchronized static void t1 ( String s) {
        System.out.println("ZIC "+ s + " " + LocalDateTime.now());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch ( InterruptedException e) {

        }
    }
}
