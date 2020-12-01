package kr.javaPractice.GodOfJava._25Thread;

public class DaemonThread extends Thread{
    public void run() {
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
