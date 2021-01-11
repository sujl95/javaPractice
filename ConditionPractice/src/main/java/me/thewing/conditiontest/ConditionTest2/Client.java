package me.thewing.conditiontest.ConditionTest2;

import org.springframework.context.annotation.Bean;

public class Client {
	public static void main(String[] args) {
		System.out.println(new Test().getClass().getAnnotation(ConditionalApp.class));
		System.out.println(new Child().getClass().getAnnotation(ConditionalApp.class));
		System.out.println(test());
	}

	@Bean
	@ConditionalApp
	public static String test() {

		return "test";
	}
}
