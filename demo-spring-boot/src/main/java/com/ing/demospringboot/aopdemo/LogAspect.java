package com.ing.demospringboot.aopdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Around("@annotation(LogStuff)")
    public Object logSomething(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Hi there!");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("Bye!");
        return proceed;
    }

    @Before("@annotation(LogStuff)")
    public Object logMethodName(JoinPoint joinPoint) throws Throwable {
        System.out.println(joinPoint.getSignature() + " was called");
        return joinPoint;
    }

}
