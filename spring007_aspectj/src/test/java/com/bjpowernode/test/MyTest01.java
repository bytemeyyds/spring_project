package com.bjpowernode.test;

import com.bjpowernode.s01.SomeService;
import com.bjpowernode.s01.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class MyTest01 {

    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        //取出代理对象
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        System.out.println(someService.getClass());
        String s = someService.doSome("张三",22);
        System.out.println(s);
    }

    @Test
    public void test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        //取出代理对象
        SomeServiceImpl someService = (SomeServiceImpl) ac.getBean("someServiceImpl");
        System.out.println(someService.getClass());
        someService.show();
    }
}
