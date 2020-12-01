package kr.javaPractice.GodOfJava._31Java7;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinSample {
    static final ForkJoinPool mainPool = new ForkJoinPool(); //1
    public static void main(String[] args) {
        ForkJoinSample sample = new ForkJoinSample();
        sample.calculate();
    }

    public void calculate() {
        long from = 0;
        long to = 10;

        GetSum2 sum = new GetSum2(from, to);
        Long result = mainPool.invoke(sum);
        System.out.println("Fork Join:Total sum of "+from+" ~ "+to+" = "+result);
    }
}
