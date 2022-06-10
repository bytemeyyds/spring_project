package com.bjpowernode.test;

import com.bjpowernode.controller.UsersController;
import com.bjpowernode.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testInsertUsers(){
        //创建谁的对象？ 应该创建UsersController对象
        UsersController usersController = new UsersController();
        int num = usersController.insert(new Users(100, "张三", 20));
        System.out.println(num);

    }

    @Test
    public void testSpringSanceng(){
        //创建对象并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("total.xml");

        //取出对象
        UsersController uController = (UsersController) ac.getBean("uController");

        //测试
        int num = uController.insert(new Users(200, "王五", 44));
        System.out.println(num);
    }
}
