package com.bjpowernode.s01;

import org.springframework.stereotype.Service;

/**
 *  业务实现类
 */
@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome的业务功能实现................");
        return "abcd";
    }

    @Override
    public void show() {
        System.out.println("show()的业务方法实现执行.............");
    }
}
