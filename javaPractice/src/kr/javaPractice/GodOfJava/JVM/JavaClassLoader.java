package kr.javaPractice.GodOfJava.JVM;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class JavaClassLoader extends ClassLoader {

    public void invokeClassMethod(String classBinName, String methodName){

        try {

            // 새 JavaClassLoader 생성
            ClassLoader classLoader = this.getClass().getClassLoader();

            // 이진 이름을 사용하여 대상 클래스 로드
            Class loadedMyClass = classLoader.loadClass(classBinName);

            System.out.println("Loaded class name: " + loadedMyClass.getName());

            // 로드된 클래스에서 새 인스턴스 만들기
            Constructor constructor = loadedMyClass.getConstructor();
            Object myClassObject = constructor.newInstance();

            // 로드된 클래스에서 대상 메서드를 가져오고 이름을 사용하여 호출
            Method method = loadedMyClass.getMethod(methodName);
            System.out.println("Invoked method name: " + method.getName());
            method.invoke(myClassObject);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}