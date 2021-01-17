package kr.javaPractice.GodOfJava._25Thread;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicTypeSample {
    public static void main(String[] args) {
//        final MyLock myLock = new MyLock();
//
//        for (int i = 0; i < 10; i++) {
//            new Thread(new AtomicTypeRunnable(myLock)).start();
//        }
        AtomicLong atomicLong = new AtomicLong();
        AtomicLong atomicLong1 = new AtomicLong(123);
        long expectedValue = 123;
        long newValue = 234;

        System.out.println(atomicLong.compareAndSet(expectedValue,newValue));
        atomicLong1.set(234);


        System.out.println(atomicLong1.compareAndSet(234,newValue));
        System.out.println(atomicLong1.compareAndSet(expectedValue,newValue));
        System.out.println(atomicLong.get());
        System.out.println(atomicLong1.get());

    }
}
