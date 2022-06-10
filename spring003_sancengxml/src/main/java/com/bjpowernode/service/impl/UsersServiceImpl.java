package com.bjpowernode.service.impl;

import com.bjpowernode.dao.UsersMapper;
import com.bjpowernode.pojo.Users;
import com.bjpowernode.service.UsersService;

/**
 * 业务逻辑层的实现类
 */
public class UsersServiceImpl implements UsersService {

    //切记：在所有的业务逻辑层中都必定有数据访问层的对象

    private UsersMapper usersMapper; //= new UsersMapperImpl();
    //交给spring去依赖注入值，必须提供setter方法
    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public int insert(Users u) {
        //可以添加复杂的业务逻辑
        return usersMapper.insert(u);
    }
}
