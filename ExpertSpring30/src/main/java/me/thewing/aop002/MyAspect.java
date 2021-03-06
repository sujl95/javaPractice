/**
 * 기존 어노테이션 기반 - MyAspect.java가 스프링 프레임워크에 종속
 */
package me.thewing.aop002;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before("execution(* runSomething()))")
    public void before(JoinPoint joinPoint) {
        System.out.println("얼굴 인식 확인 : 문을 개방하라");
    }
}
