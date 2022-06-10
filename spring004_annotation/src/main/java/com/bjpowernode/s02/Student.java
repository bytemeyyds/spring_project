package com.bjpowernode.s02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //交给spring去创建对象，就是在容器启动时创建
public class Student {
    @Value("lisi")
    private String name;
    @Value("24")
    private int age;

//    //引用类型按照类型注入
//    @Autowired

    //引用类型按照名称注入
    @Autowired
    @Qualifier("school")
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
