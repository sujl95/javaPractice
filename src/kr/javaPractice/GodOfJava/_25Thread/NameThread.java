package kr.javaPractice.GodOfJava._25Thread;

public class NameThread extends Thread{
    private int calcNumber;
    public NameThread(String name,int calcNumber) {
        super(name);
        this.calcNumber = calcNumber;

    }
    public void run() {
        calcNumber++;
    }
}
