package com.proxy5;

/**
 * 第三个版本：使用静态代理拆分业务和切面.业务和业务接口已拆分.此时切面紧耦合在业务中.
 *
 */
public interface Service {
    //规定业务
    void buy();

    default String show(){return null;}
}
