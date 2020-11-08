package kr.javaPractice.GodOfJava._25Thread;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class MultiThreadSample {
    public static void main(String[] args) throws InterruptedException{
        MultiThreadSample sample = new MultiThreadSample();
        Thread thread1 = new Thread(() ->{
            System.out.println("thread1 before call "+ LocalDateTime.now());

        });

    }

    private synchronized void syncMethod1 (String msg) {
        System.out.println("in the syncMethod1 "+msg +" "+ LocalDateTime.now());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void syncMethod2 (String msg) {
        System.out.println("in the syncMethod2 "+msg+" ");
    }
}
