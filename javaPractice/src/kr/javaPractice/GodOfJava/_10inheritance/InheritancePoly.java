package kr.javaPractice.GodOfJava._10inheritance;

public class InheritancePoly {
    public static void main(String[] args) {
        InheritancePoly inheritance = new InheritancePoly();
        inheritance.callPrintNames();
    }

    public void callPrintNames(){
        Parent parent1 = new Parent();
        System.out.println("create parent1");
        Parent parent2 = new Child();
        System.out.println("create parent2");
        Parent parent3 = new ChildOther();
        System.out.println("create parent3");

        parent1.printName();
        System.out.println("printName1");
        parent2.printName();
        System.out.println("printName2");
        parent3.printName();
        System.out.println("printName3");

    }
}
