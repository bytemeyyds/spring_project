package com.bjpowernode.s01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 *  此类为切面类,包含各种切面方法
 */
@Aspect  //交给AspectJ的框架去识别切面类
@Component
public class MyAspect {
    /**
     * 所有切面的功能都是由切面方法来实现的
     * 可以将各种切面都在此类中进行开发
     *
     * 前置通知的切面方法的规范
     * 1)访问权限是public
     * 2)方法的返回值是void
     * 3)方法名称自定义
     * 4)方法没有参数,如果有也只能是JoinPoint类型
     * 5)必须使用@Before注解来声明切入的时机是前切功能和切入点
     *   参数:value  指定切入点表达式
     *
     * 业务方法
     * public String doSome(String name, int age)
     */
//    @Before(value = "execution(public String com.bjpowernode.s01.SomeServiceImpl.*(String,int))")
//    public void myBefore(){
//        System.out.println("切面方法中的前置通知功能实现............");
//    }

//    @Before(value = "execution(public * com.bjpowernode.s01.SomeServiceImpl.*(..))")
//    public void myBefore(){
//        System.out.println("切面方法中的前置通知功能实现............");
//    }

    @Before(value = "execution( * com.bjpowernode.s01.*.*(..))")
    public void myBefore(JoinPoint jp){
        System.out.println("切面方法中的前置通知功能实现............");
        System.out.println("目标方法的签名:"+jp.getSignature());
        System.out.println("目标方法的参数:"+ Arrays.toString(jp.getArgs()));
    }
//    @Before(value = "execution( * com.bjpowernode.s01..*(..))")
//    public void myBefore(){
//        System.out.println("切面方法中的前置通知功能实现............");
//    }

//    @Before(value = "execution( * *(..))")
//    public void myBefore(){
//        System.out.println("切面方法中的前置通知功能实现............");
//    }
}
