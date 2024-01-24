package com.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MetricAspect {

    @Around("execution(@com.example.Metric * *(..))")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.nanoTime();

        Object result = joinPoint.proceed();
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Method " + joinPoint.getSignature().toShortString() +
                           " executed in " + executionTime + " nanoseconds");

        return result;
    }
}
