package com.weifang.dao;

import com.weifang.pojo.User;

/**
 * @Program: spring
 * @ClassName: UserMapperImpl
 * @Version: 1.0
 * @Description: 数据访问层实现类
 * @Author: zhezhi
 * @Create-Date: 2022-06-12 10:55
 **/

public class UserMapperImpl implements UserMapper{

    @Override
    public int insertUser(User user) {
        System.out.println(user.getName()+"用户增加成功。。。。。");
        return 1;
    }
}
