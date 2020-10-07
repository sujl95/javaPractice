package kr.javaPractice.GodOfJava._15String;

public class StringCompare {
    public static void main(String[] args) {
        StringCompare sample = new StringCompare();
        sample.checkCompareTo();
    }

    private void checkCompare() {
        String text = "Check value";
        String text2 = "check value";
//        if(text==text2){
//            System.out.println("text==text2 result is same");
//        } else {
//            System.out.println("text==text2 result is different.");
//        }
        if (text.equalsIgnoreCase("Check value")){
            System.out.println("text.equalsIgnoreCase(text2) result is same");
        }
    }

    public void checkCompareTo(){
        String text ="a";
        String text2 ="b";
        String text3 ="c";
        System.out.println(text2.compareTo(text));
        System.out.println(text2.compareTo(text3));
        System.out.println(text.compareTo(text3));
    }

}
