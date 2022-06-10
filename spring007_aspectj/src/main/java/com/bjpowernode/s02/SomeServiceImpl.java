package com.bjpowernode.s02;

import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome()业务方法被执行............");
        return "abcd";
    }

    @Override
    public Student change() {
        System.out.println("change()方法被执行............");
       // System.out.println(1/0);
        return new Student("张三");
    }
}
