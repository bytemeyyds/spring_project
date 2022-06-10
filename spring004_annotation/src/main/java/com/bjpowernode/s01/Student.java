package com.bjpowernode.s01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //交给spring去创建对象，就是在容器启动时创建
public class Student {
    @Value("何国庆")
    private String name;
    @Value("24")
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
        System.out.println("学生对象的无参构造方法执行了。。。。");

    }
}
