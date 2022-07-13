package com.weifang.service.impl;

import com.weifang.mapper.UsersMapper;
import com.weifang.pojo.Users;
import com.weifang.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Program: spring
 * @ClassName: UsersServiceImpl
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-13 16:21
 **/

@Service
public class UsersServiceImpl implements UsersService {

    /*
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            sqlSession = factory.openSession();
            userMapper = sqlSession.getMapper(UserMapper.class);
    * */
    //所有业务逻辑层中一定会有数据访问层的对象。
    @Autowired
    UsersMapper usersMapper;
    @Override
    public int insert(Users users) {
        return usersMapper.insert(users);
    }
}
