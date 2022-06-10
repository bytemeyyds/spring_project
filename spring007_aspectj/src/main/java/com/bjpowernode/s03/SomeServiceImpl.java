package com.bjpowernode.s03;

import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class SomeServiceImpl implements SomeService{
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome业务方法被执行...."+name);
        return "abcd";
    }
}
