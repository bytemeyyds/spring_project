package com.proxy4;

/**
 * 切面接口
 */
public interface AOP {
    //default可以支持实现类不用必须实现该方法
    default void before(){}
    default void after(){}
    default void exception(){}
}
