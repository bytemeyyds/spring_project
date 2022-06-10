package com.bjpowernode.test;

import com.bjpowernode.controller.UsersController;
import com.bjpowernode.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testInsertUsers(){
        //创建并启动容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("total.xml");
        //取出Controller对象
        UsersController usersController = (UsersController) ac.getBean("usersController");

        usersController.insert(new Users(100,"haha",66));

    }
}
