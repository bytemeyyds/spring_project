package com.bjpowernode.test;

import com.bjpowernode.pojo2.Student;
import com.bjpowernode.pojo2.School;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {
    @Test
    public void testSchool(){
        //创建容器对象并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");

        //取出学校对象
        School school = (School) ac.getBean("school");

        System.out.println(school);
    }
    @Test
    public void testStudentSchool(){
        //创建容器对象并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");

        //取出学校对象
        Student student = (Student) ac.getBean("stu");

        System.out.println(student);
    }
}
