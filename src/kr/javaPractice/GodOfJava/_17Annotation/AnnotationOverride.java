package kr.javaPractice.GodOfJava._17Annotation;

import kr.javaPractice.GodOfJava._10inheritance.Parent;

public class AnnotationOverride extends Parent {
    @Override
    public void printName() {
        System.out.println("AnnotationOverride");
    }
}
