package me.thewing.conditiontest.ConditionTest2;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OnWindowSys implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

		System.out.println("OnWindowSys ck");
		if ("1".equals("1")) {
			System.out.println(context);
			System.out.println(metadata);
		}
		return true;
	}
}
