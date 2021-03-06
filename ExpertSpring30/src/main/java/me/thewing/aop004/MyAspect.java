/**
 * 변경
 * POJO & XML 기반 - 스프링 프레임워크에 종속되지 않음
 */
package me.thewing.aop004;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    public void before(JoinPoint joinPoint) {
        System.out.println("얼굴 인식 확인 : 문을 개방하라");
    }

    public void lockDoor(JoinPoint joinPoint) {
        System.out.println("주인님 나갔다 : 문을 잠궈");
    }
}
