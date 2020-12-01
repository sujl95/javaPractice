package kr.javaPractice.GodOfJava.JVM;

public class ClassLoaderTest extends JavaClassLoader {

    public static void main(String[] args) {
        JavaClassLoader javaClassLoader = new JavaClassLoader();
        javaClassLoader.invokeClassMethod("kr.javaPractice.GodOfJava.JVM.MyClass", "sayHello");
    }
}
