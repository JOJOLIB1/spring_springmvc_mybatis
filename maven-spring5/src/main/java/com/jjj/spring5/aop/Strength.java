package com.jjj.spring5.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @className: com.jjj.spring5.aop.Strength
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-02 8:13
 */
@Component
@Aspect
@Order(0)
public class Strength {
    @Pointcut(value = "execution(* com.jjj.spring5.aop.ToStrength.toStrengthMethod(..))")
    public void executionExp() {}

    @Before(value = "executionExp()")
    public void before() {
        System.out.println("前置通知 == before");
    }
    @AfterReturning(value = "executionExp()")
    public void afterReturning() {
        System.out.println("后置通知 == afterReturning");
    }
    @After(value = "executionExp()")
    public void after() {
        System.out.println("最终通知 == after");
    }
    @AfterThrowing(value = "executionExp()")
    public void afterThrowing() {
        System.out.println("异常通知 == afterThrowing");
    }
    @Around(value = "executionExp()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕之前置");
        joinPoint.proceed();
        System.out.println("环绕之后置");
    }
    // 环绕通知应该是前置+最终
}
