package com.weifang.service.impl;

import com.weifang.dao.UserMapper;
import com.weifang.dao.UserMapperImpl;
import com.weifang.pojo.User;
import com.weifang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Program: spring
 * @ClassName: UserServiceImpl
 * @Version: 1.0
 * @Description: 业务逻辑层实现类
 * @Author: zhezhi
 * @Create-Date: 2022-06-12 13:47
 **/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    //@Qualifier("userMapperImpl")
    private UserMapper userMapper;
    @Override
    public int insert(User user) {
        //添加更复杂的业务
        //…………
        return userMapper.insertUser(user);
    }
}
