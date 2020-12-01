package kr.javaPractice.GodOfJava._10inheritance;

public class InheritancePrint {
    public static void main(String[] args) {
//        Child child = new Child();
//        child.printName();

//        ChildPrint childPrint = new ChildPrint();
//        childPrint.printName();

//        ChildOverridingPrivate child = new ChildOverridingPrivate();
//        child.printName();

        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        ParentCasting obj1 = new ChildCasting();
        ChildCasting obj2 = (ChildCasting) new ParentCasting();


    }
}
