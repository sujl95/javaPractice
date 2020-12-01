package kr.javaPractice.GodOfJava._15String;

public class Test implements CharSequence {
    public static void main(String[] args) {
        String str = new String("test");
        CharSequence charSequence = new StringBuffer("sungjun");
        CharSequence charSequence1 = new StringBuilder("sungjun");
        System.out.println(charSequence);
        System.out.println(charSequence1);
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
