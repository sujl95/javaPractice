package kr.javaPractice.GodOfJava._31Java7;

import java.util.concurrent.RecursiveTask;


public class GetSum extends RecursiveTask<Long> {
    long from, to;
    public GetSum(long from, long to) { //1
        this.from = from;
        this.to = to;;
    }

    public Long compute() {
        long gap = to - from; //2
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }


        if (gap <= 3) { //3
            long tempSum = 0;
            for (long loop = from; loop <= to; loop++) {
                tempSum += loop;
            }
            return tempSum; //4
        }
        long middle = (from + to) / 2; //5
        GetSum2 sumPre = new GetSum2(from, middle); //6
        sumPre.fork(); //7
        GetSum2 sumPost = new GetSum2(middle + 1, to); //8
        return sumPost.compute() + sumPre.join(); //9
    }

}
