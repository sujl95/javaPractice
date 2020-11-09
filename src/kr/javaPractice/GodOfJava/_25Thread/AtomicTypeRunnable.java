package kr.javaPractice.GodOfJava._25Thread;

public class AtomicTypeRunnable implements Runnable{
    private final MyLock myLock;

    public AtomicTypeRunnable(MyLock myLock) {
        this.myLock = myLock;
    }

    @Override
    public void run()  {
        System.out.println(Thread.currentThread().getName() + " - " + myLock.tryLock());
    }
}
