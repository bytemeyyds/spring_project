package com.bjpowernode.controller;

import com.bjpowernode.pojo.Users;
import com.bjpowernode.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 界面层
 */
@Controller //交给spring 去创建对象
public class UsersController {

    //界面层如何访问业务逻辑层:就是创建对象
    //切记：所有的界面层都有业务逻辑层的对象
    @Autowired
    public UsersService usersService;// = new UsersServiceImpl();


    //界面层的功能实现，就是对外提供访问功能
    public int insert(Users users){
        return usersService.insert(users);
    }
}
