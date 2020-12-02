/**
 * 변경
 * POJO & XML 기반 - 스프링 프레임워크에 종속되지 않음
 */
package me.thewing.aop006;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* runSomething())")
    public void iampc() {
        // 여긴 무엇을 사용해도 의미가 없다
    }
    
    @Before("iampc()")
    public void before(JoinPoint joinPoint) {
        System.out.println("얼굴 인식 확인 : 문을 개방하라");
    }

    @After("iampc()")
    public void lockDoor(JoinPoint joinPoint) {
        System.out.println("주인님 나갔다 : 문을 잠궈");
    }
}
