package kr.javaPractice.GodOfJava._10inheritance;

public class ChildPrint extends Parent{
    public ChildPrint() {
        System.out.println("Child Constructor");
    }

    public void printAge() {
        System.out.println("printAge() - 18 month");
    }

    public void printName() {
        System.out.println("Child Print printName()");
    }

}
