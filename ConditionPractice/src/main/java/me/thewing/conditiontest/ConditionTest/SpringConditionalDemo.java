package me.thewing.conditiontest.ConditionTest;// package me.thewing.boardproject.test.ConditionTest;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.annotation.Condition;
// import org.springframework.context.annotation.ConditionContext;
// import org.springframework.context.annotation.Conditional;
// import org.springframework.core.type.AnnotatedTypeMetadata;
// import org.springframework.stereotype.Component;
//
// public class SpringConditionalDemo {
// 	public static void main(String[] args) throws Exception {
// 		System.out.println("Application started...");
//
// 		final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//
// 		// setup configuration
// 		applicationContext.scan("me.thewing.boardproject.test.ConditionTest");
//
// 		// setup all the dependencies (refresh) and make them run (start)
// 		applicationContext.refresh();
// 		applicationContext.start();
//
// 		try {
// 			applicationContext.getBean(Config.class).bean.run();
// 		} finally {
// 			applicationContext.close();
// 		}
//
// 	}
//
// 	@Component
// 	public static class Config {
// 		@Autowired
// 		MyBean bean;
// 	}
//
// 	public static class LocalConfigCondition implements Condition {
// 		@Override
// 		public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
// 			System.out.println("LocalConfig");
// 			return "local".equals(context.getEnvironment().getProperty("config.condition", "local"));
// 		}
// 	}
//
// 	public static class RemoteConfigCondition implements Condition {
// 		@Override
// 		public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
// 			System.out.println("RemoteConfig");
// 			return "remote".equals(context.getEnvironment().getProperty("config.condition"));
// 		}
//
// 	}
//
// 	public interface MyBean {
// 		default void run() {
// 			System.out.println("My Bean default is running");
// 		}
// 	}
//
// 	@Component
// 	@Conditional(LocalConfigCondition.class)
// 	public static final class LocalBean implements MyBean {
// 		public void run() {
// 			System.out.println("Local bean is running");
// 		}
// 	}
//
// 	@Component
// 	@Conditional(RemoteConfigCondition.class)
// 	public static final class RemoteBean implements MyBean {
// 		public void run() {
// 			System.out.println("Remote bean is running");
// 		}
// 	}
// }
