package com.bjpowernode.test;


import com.bjpowernode.s04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class MyTest04 {

    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s04/applicationContext.xml");
        //取出代理对象
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        String s = someService.doSome("张三",22);
        System.out.println("在测试方法中目标方法的返回值:"+s);

    }


}
