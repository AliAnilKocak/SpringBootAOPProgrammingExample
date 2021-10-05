package com.nibblebytes.aopprogramming.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component //for ioc container initliaztion
public class ServiceAspect {

    @Before("execution(* com.nibblebytes.aopprogramming.service.*.*(..))") //all metot from any service packages
    public void beforeReceiveMessage(JoinPoint joinPoint) {
        System.out.println("Params detect BEFORE ReceiveMessage method " + joinPoint.getArgs()[0]);
    }

    @After("execution(* com.nibblebytes.aopprogramming.service.*.*(..))")
    public void AfterReceiveMessage(JoinPoint joinPoint) {
        System.out.println("Params detect AFTER ReceiveMessage method " + joinPoint.getArgs()[0]);
    }


}
