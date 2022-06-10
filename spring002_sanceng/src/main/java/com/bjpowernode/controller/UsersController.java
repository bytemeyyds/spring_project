package com.bjpowernode.controller;

import com.bjpowernode.service.impl.UsersServiceImpl;
import com.bjpowernode.pojo.Users;
import com.bjpowernode.service.UsersService;

/**
 * 界面层
 */
public class UsersController {

    //界面层如何访问业务逻辑层:就是创建对象
    //切记：所有的界面层都有业务逻辑层的对象
    public UsersService usersService = new UsersServiceImpl();


    //界面层的功能实现，就是对外提供访问功能
    public int insert(Users users){
        return usersService.insert(users);
    }
}
