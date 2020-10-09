package kr.javaPractice.GodOfJava._17Annotation;

public class AnnotationSample {

    public static void main(String[] args) {
        AnnotationSample sample = new AnnotationSample();
        sample.useDeprecated();
    }
    @SuppressWarnings("deprecation")
    public void useDeprecated() {
        AnnotationDeprecated child = new AnnotationDeprecated();
        child.noMoreUse();
    }

}
