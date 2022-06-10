package com.bjpowernode.test;

import com.bjpowernode.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {


    @Test
    public void testStudent2(){
        //创建容器对象并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");

        //取出对象
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }
}
