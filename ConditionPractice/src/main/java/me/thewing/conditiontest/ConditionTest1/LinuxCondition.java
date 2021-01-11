package me.thewing.conditiontest.ConditionTest1;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		System.out.println("LinuxCondition");
		return context.getEnvironment().getProperty("os.name").contains("Window");
	}
}
