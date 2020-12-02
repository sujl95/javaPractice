/**
 * 변경
 * POJO & XML 기반 - 스프링 프레임워크에 종속되지 않음
 */
package me.thewing.aop003;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    public void before(JoinPoint joinPoint) {
        System.out.println("얼굴 인식 확인 : 문을 개방하라");
    }
}
