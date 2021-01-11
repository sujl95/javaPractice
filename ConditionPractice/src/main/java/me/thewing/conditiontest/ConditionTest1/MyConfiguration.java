package me.thewing.conditiontest.ConditionTest1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.thewing.conditiontest.ConditionTest2.Test;

@Configuration
@WindowExtendsAnnotation
public class MyConfiguration {
	@Bean(name = "emailerService")
	// @Conditional(WindowsCondition.class)
	// @Conditional(WindowsCondition.class)
	public TestService windowsEmailerService() {
		System.out.println("windowsEmailerService ck");
		System.out.println(new MyConfiguration().getClass().getAnnotation(WindowExtendsAnnotation.class));
		System.out.println(new ChildConfiguration().getClass().getAnnotation(WindowExtendsAnnotation.class));


		return new TestService();
	}
}

class ChildConfiguration extends MyConfiguration{
	@Bean(name = "childService")
	public Test linuxEmailerServet() {
		System.out.println(new ChildConfiguration().getClass().getAnnotation(WindowExtendsAnnotation.class));
		System.out.println("linuxEmailerService ck");
		return new Test();
	}
}