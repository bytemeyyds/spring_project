package com.bjpowernode.s04;

import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome业务方法被执行...."+name);
        //System.out.println(1/0);
        return "abcd";
    }
}
