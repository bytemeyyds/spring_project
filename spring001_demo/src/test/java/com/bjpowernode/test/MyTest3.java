package com.bjpowernode.test;

import com.bjpowernode.pojo3.School;
import com.bjpowernode.pojo3.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest3 {
    @Test
    public void testSchool(){
        //创建容器对象并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");

        //取出学校对象
        School school = (School) ac.getBean("school");

        System.out.println(school);
    }
    @Test
    public void testStudent(){
        //创建容器对象并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");

        //取出学校对象
        Student stu = (Student) ac.getBean("student");

        System.out.println(stu);
    }
    @Test
    public void testStudentSequence(){
        //创建容器对象并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");

        //取出学校对象
        Student stu = (Student) ac.getBean("stuSequence");

        System.out.println(stu);
    }

}
