package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class HelloBeanAspect {

    @Before("execution(* com..HelloBean.formatData(..))")
    public void beforeHelloBean(JoinPoint joinPoint) {
        System.out.println("HelloBeanAspect::beforeHelloBean <- start");

        System.out.println("Join Point = " + joinPoint.getStaticPart().toLongString());
        System.out.println("Signature = " + joinPoint.getSignature());
        System.out.println("Args = " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("Kind = " + joinPoint.getKind());

        System.out.println("HelloBeanAspect::beforeHelloBean <- stop\n\n");
    }

    @After("execution(* com..HelloBean.formatData(..))")
    public void afterHelloBean(JoinPoint joinPoint) {
        System.out.println("\n\nHelloBeanAspect::afterHelloBean <- start");

        System.out.println("Join Point = " + joinPoint.getStaticPart().toLongString());
        System.out.println("Signature = " + joinPoint.getSignature());
        System.out.println("Args = " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("Kind = " + joinPoint.getKind());

        System.out.println("HelloBeanAspect::afterHelloBean <- stop\n\n");
    }

    @AfterReturning(value = "execution(* com..HelloBean.formatData(..))", returning = "returnValue")
    public void afterReturningHelloBean(JoinPoint joinPoint, Object returnValue) {
        System.out.println("\n\nHelloBeanAspect::afterReturningHelloBean <- start");

        System.out.println("Join Point = " + joinPoint.getStaticPart().toLongString());
        System.out.println("Signature = " + joinPoint.getSignature());
        System.out.println("Args = " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("Kind = " + joinPoint.getKind());
        System.out.println("Return Value = " + returnValue);

        System.out.println("HelloBeanAspect::afterReturningHelloBean <- stop\n\n");
    }

    @AfterThrowing(value = "within(com..HelloBean)", throwing = "exception")
    public void afterThrowingHelloBean(JoinPoint joinPoint, Exception exception) {
        System.out.println("\n\nHelloBeanAspect::afterThrowingHelloBean <- start");

        System.out.println("Join Point = " + joinPoint.getStaticPart().toLongString());
        System.out.println("Signature = " + joinPoint.getSignature());
        System.out.println("Args = " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("Kind = " + joinPoint.getKind());
        System.out.println("Exception = " + exception);

        System.out.println("HelloBeanAspect::afterThrowingHelloBean <- stop\n\n");
    }

    @Around("execution(* com..HelloBean.formatData(..))")
    public Object aroundHelloBean(ProceedingJoinPoint joinPoint) throws Throwable {
        Object returnValue = joinPoint.proceed();

        return returnValue + " - Modified";
    }
}
