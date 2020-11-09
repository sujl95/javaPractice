package kr.javaPractice.GodOfJava._25Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class MyLock {
//    private boolean locked = false;
    private AtomicBoolean locked = new AtomicBoolean();
    private AtomicLong atomicLong = new AtomicLong();
    public boolean tryLock() {
//        if(!locked) {
//            long start = System.currentTimeMillis();
//            for (int i = 0; i<10000;i++){
//
//            }
//            long end = System.currentTimeMillis();
//            System.out.println(end - start);
//            locked = true;
//            return true;
//        }
//        return false;

        if (!locked.get()) {
            for (int i = 0; i < 100000; i++) {

            }
        }
        return locked.compareAndSet(false, true);


    }
}
