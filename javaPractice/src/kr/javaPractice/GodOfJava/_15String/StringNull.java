package kr.javaPractice.GodOfJava._15String;

public class StringNull {
    public static void main(String[] args) {
        StringNull sample = new StringNull();
        sample.nullCheck2(null);
    }

    public boolean nullCheck(String text) {
        int textLength = text.length();
        System.out.println(textLength);
        if(text==null)return true;
        else return false;
    }

    public boolean nullCheck2(String text) {
        if(text == null) {
            return true;
        } else {
            int textlength = text.length();
            System.out.println(textlength);
            return false;
        }
    }

}
