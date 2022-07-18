package com.weifang.service.impl;

import com.weifang.mapper.UsersMapper;
import com.weifang.pojo.Accounts;
import com.weifang.pojo.Users;
import com.weifang.service.AccountsService;
import com.weifang.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Program: spring
 * @ClassName: UsersServiceImpl
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-13 16:21
 **/

@Service
//@Transactional(propagation = Propagation.REQUIRED)
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
    @Autowired
    AccountsService accountsService;
    @Override
    public int insert(Users users) {
        int num = usersMapper.insert(users);
        System.out.println("用户增加成功，num="+num);
        //调用账户的增加操作；
        num = accountsService.save(new Accounts(334,"网五","333"));
        return num;
    }
}
