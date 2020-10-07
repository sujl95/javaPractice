package kr.javaPractice.GodOfJava._15String;

public class StringCompare {
    public static void main(String[] args) {
        StringCompare sample = new StringCompare();

        String[] addresses = new String[]{
          "서울시 구로구 신림동","경기도 성남시 분당구 정자동 개발 공장",
            "서울시 구로구 개봉동",
        };
        sample.checkMatch();
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

    public void checkAddress(String[] addresses) {
        int startCount = 0, endCount = 0;
        String startText = "서울시";
        String endText = "동";
        for(String address: addresses){
            if (address.startsWith(startText)){
                startCount++;
            }
            if (address.endsWith(endText)){
                endCount++;
            }
        }
        System.out.println("Starts with " + startText + " count is " + startCount);
        System.out.println("Ends with " + endText + " count is " + endCount);
    }

    public void containsAddress(String[] addresses){
        int containCount=0;
        String containText = "구로";
        for (String address : addresses) {
            if(address.contains(containText)) {
                containCount++;
            }
        }

        System.out.println("Contains " + containText + " count is " + containCount);

    }

    public void checkMatch() {
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";
        System.out.println(text.regionMatches(2, compare1, 0, 1));
        System.out.println(text.regionMatches(5, compare1, 0, 2));
        System.out.println(text.regionMatches(true,0, compare2, 0, 4));
    }

}
