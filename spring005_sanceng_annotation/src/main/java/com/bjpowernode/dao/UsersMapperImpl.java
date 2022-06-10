package com.bjpowernode.dao;

import com.bjpowernode.pojo.Users;
import org.springframework.stereotype.Repository;

/**
 * 数据访问层的实现类
 */

@Repository  //交给sqpring框架去创建数据访问层的对象
public class UsersMapperImpl implements UsersMapper {
    @Override
    public int insert(Users u) {
        System.out.println(u.getUname()+"用户增加成功");
        return 1;
    }
}
