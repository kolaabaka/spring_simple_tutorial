package com.fx.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {

//    @Before("execution(* com.fx.TaskManager.*(..))")
//    public void logBefore(JoinPoint joinPoint){
//        System.out.println("Call method before: " + joinPoint.getSignature().getName());
//    }
//
//    @AfterReturning(value = "execution(* com.fx.TaskManager.*(..))", returning = "resulta")
//    public void logAfterReturning(JoinPoint joinPoint, Object resulta){
//        System.out.println("Call method after returning, result: " + resulta);
//    }
//
//    @AfterThrowing(value = "execution(* com.fx.TaskManager.*(..))")
//    public void logAfterThrow(JoinPoint joinPoint, Exception exception){
//        System.out.println("Exception in: " + exception.getMessage());
//    }
//
//    @After(value = "execution(* com.fx.TaskManager.*(..))")
//    public void logAfter(JoinPoint joinPoint){
//        System.out.println("After : " + joinPoint.getSignature());
//    }

//    @Around(value = "execution(* com.fx.TaskManager.*(..))")
//    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) {
//        System.out.println("Before method");
//        Object result = null;
//        //currentTime before
//        try {
//            result = proceedingJoinPoint.proceed();
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        }
//        //currentTime after
//        System.out.println("After method");
//        return result;
//    }

    @Before("@annotation(loggable)")
    public void log(JoinPoint joinPoint, Loggable loggable){
        for(int i = 0; i < loggable.times(); i++){
            System.out.printf("Log %s: before method %s\n", loggable.value(), joinPoint.getSignature());
        }
    }
}
