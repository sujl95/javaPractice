package kr.javaPractice.GodOfJava._10inheritance;

public class ParentArg {
    public ParentArg(String name) {
        System.out.println("ParentArg("+name+") Constructor");
    }

    public ParentArg(InheritancePrint obj){
        System.out.println("ParentArg(InheritancePrint) Constructor");
    }

    public void printName() {
        System.out.println("Parent printName()");
    }
    private void privateMethod() {
        System.out.println("privateMethod()");
    }
}
