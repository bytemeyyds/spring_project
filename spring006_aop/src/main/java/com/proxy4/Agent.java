package com.proxy4;

/**
 * 静态代理已经实现了目标对象和切面对象的灵活切换
 * 图书购买功能，商品业务功能、切面功能转换。。。都可以实现
 */
public class Agent implements Service {
    //设计成员变量的类型为接口，为了灵活切换目标对象
    public Service target;

    //传入切面对象
    public AOP aop;

    //使用构造方法传入目标对象和切面对象
    public Agent(Service target,AOP aop){
        this.target = target;
        this.aop = aop;
    }

    @Override
    public void buy() {
        try{
            //切面功能
            aop.before();

            //业务功能
            target.buy();

            //切面功能
            aop.after();
        } catch (Exception e){
            aop.exception();
        }

    }
}
