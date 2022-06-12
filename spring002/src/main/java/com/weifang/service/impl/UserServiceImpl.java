package com.weifang.service.impl;

import com.weifang.dao.UserMapper;
import com.weifang.dao.UserMapperImpl;
import com.weifang.pojo.User;
import com.weifang.service.UserService;

/**
 * @Program: spring
 * @ClassName: UserServiceImpl
 * @Version: 1.0
 * @Description: 业务逻辑层实现类
 * @Author: zhezhi
 * @Create-Date: 2022-06-12 13:47
 **/

public class UserServiceImpl implements UserService {

    private final UserMapper userMapper = new UserMapperImpl();
    @Override
    public int insert(User user) {
        //添加更复杂的业务
        //…………
        return userMapper.insertUser(user);
    }
}
