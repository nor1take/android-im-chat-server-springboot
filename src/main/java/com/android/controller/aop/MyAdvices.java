package com.android.controller.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Aspect
public class MyAdvices {

    @Pointcut("execution(* com.android.controller.*Controller.*(..))")
    private void pointcut() {
    }

    @AfterReturning(value = "pointcut()", returning = "ret")
    public void printLogMethod(JoinPoint jp, Object ret) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) + "  INFO 2618 --- " + ret);
    }


    @Pointcut("execution(* com.android.*.*.*(..))")
    private void pointcut2() {
    }

    @Around("pointcut2()")
    public Object throwExceptionMethod(ProceedingJoinPoint pjp) throws Throwable {
        Object ret;
        try {
            ret = pjp.proceed();
        } catch (Exception ex) {
            System.out.println(ex);
            throw new Exception(ex);
        }
        return ret;
    }


}
