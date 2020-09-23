package kr.javaPractice.GodOfJava._14exceiption;

public class FinallySample {
    public static void main(String[] args) {
        FinallySample sample = new FinallySample();
        sample.finallySample();
    }

    private void finallySample() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        } catch (Exception e){
            System.out.println(intArray.length);
        } finally {
            System.out.println("Here is finally");

        }
        System.out.println("This code must run");
    }
}
