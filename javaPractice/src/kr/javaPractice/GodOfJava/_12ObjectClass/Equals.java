package kr.javaPractice.GodOfJava._12ObjectClass;

public class Equals {
    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalMethod();
    }

    public void equalMethod(){
        MemberDTO obj1 = new MemberDTO("SungJun");
        MemberDTO obj2 = new MemberDTO("SungJun");
        if(obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }


    }

}
