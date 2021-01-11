package kr.javaPractice.test;

public class Client {
	public static void main(String[] args) {
		System.out.println(new Test().getClass().getAnnotation(MyAnnotation.class));
		System.out.println(new Child().getClass().getAnnotation(MyAnnotation.class));
	}
}
