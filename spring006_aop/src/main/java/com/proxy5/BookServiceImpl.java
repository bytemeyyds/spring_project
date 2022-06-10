package com.proxy5;

public class BookServiceImpl implements Service {
    @Override
    public void buy() {
        System.out.println("图书购买功能实现。。。。。。");
    }

    @Override
    public String show() {
        System.out.println("这是show方法");
        return "show";
    }
}
