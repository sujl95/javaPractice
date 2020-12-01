package kr.javaPractice.GodOfJava._14exceiption;

public class ExceptionSample {
    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        sample.arrayOutOfBoundsTryCatch();
    }

    private void arrayOutOfBounds() {
        int[] intArray= new int[5];
        System.out.println(intArray[5]);
    }

    private void arrayOutOfBoundsTryCatch() {
        int[] intArray= new int[5];
        try {
            System.out.println(intArray[5]);
            System.out.println("This code should run");
        } catch (Exception e){
            System.err.println("Exception occurred.");
        }
        System.out.println("This code must run.");
    }
}
