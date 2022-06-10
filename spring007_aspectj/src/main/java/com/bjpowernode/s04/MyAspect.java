package com.bjpowernode.s04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 *
 */
@Aspect
@Component
public class MyAspect {
    /**
     * 最终通知方法的规范
     * 1)访问权限是public
     * 2)方法没有返回值
     * 3)方法名称自定义
     * 4)方法没有参数,如果有也只能是JoinPoint
     * 5)使用@After注解表明是最终通知
     *   参数:
     *     value:指定切入点表达式
     */
    @After(value = "mycut()")
    public void myAfter(){
        System.out.println("最终通知的功能........");
    }
    @Before(value = "mycut()")
    public void myBefore(){
        System.out.println("前置通知的功能........");
    }
    @AfterReturning(value = "mycut()",returning = "obj")
    public void myAfterReturning(Object obj){
        System.out.println("后置通知的功能........");
    }
    @Around(value = "mycut()")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知中的前置通知的功能........");
        Object obj = pjp.proceed(pjp.getArgs());
        System.out.println("环绕通知中的后置通知的功能........");
        return obj;
    }
    @Pointcut(value = "execution(* com.bjpowernode.s04.*.*(..))")
    public void mycut(){}
}
