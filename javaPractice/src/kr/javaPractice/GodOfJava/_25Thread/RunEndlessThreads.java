package kr.javaPractice.GodOfJava._25Thread;

public class RunEndlessThreads {
    public static void main(String[] args) {
        RunEndlessThreads sample = new RunEndlessThreads();
        sample.endless();
    }

    public void endless() {
        EndlessThread thread = new EndlessThread();
        thread.start();
    }
}
