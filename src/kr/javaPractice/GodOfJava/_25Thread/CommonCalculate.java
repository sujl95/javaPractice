package kr.javaPractice.GodOfJava._25Thread;

public class CommonCalculate {
    private int amount;
    Object lock = new Object();
    public CommonCalculate() {
        amount=0;
    }

    public void plus(int value) {
        synchronized (this){
            amount += value;
        }
    }

    public void minus(int value) {
        synchronized (this){
            amount -= value;
        }
    }

    public int getAmount() {
        return amount;
    }

}
