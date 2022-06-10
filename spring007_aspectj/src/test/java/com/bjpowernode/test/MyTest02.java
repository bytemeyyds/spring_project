package com.bjpowernode.test;

import com.bjpowernode.s02.SomeService;
import com.bjpowernode.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class MyTest02 {

    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        //取出代理对象
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        String s = someService.doSome("张三",22);
        System.out.println("在测试方法中目标方法的返回值:"+s);

    }










    @Test
    public void test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        //取出代理对象
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        Student stu = someService.change();
        System.out.println("在测试为中目标方法的返回值是:"+stu);

    }

}
