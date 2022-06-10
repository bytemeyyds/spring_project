package com.proxy4;

public class LogAop implements AOP{
    @Override
    public void before() {
        System.out.println("前置日志输出");
    }
}
