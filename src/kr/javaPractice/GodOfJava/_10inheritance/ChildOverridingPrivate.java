package kr.javaPractice.GodOfJava._10inheritance;

public class ChildOverridingPrivate extends ParentOverridingPrivate {
    public ChildOverridingPrivate() {
        System.out.println("ChildOverridingPrivate Constructor");
    }

    public void printName(){
        System.out.println("ChildOverridingPrivate - printName()");
    }
}
