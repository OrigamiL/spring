package com.weifang.service.impl;

import com.weifang.mapper.AccountsMapper;
import com.weifang.pojo.Accounts;
import com.weifang.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Program: spring
 * @ClassName: AccountsServiceImpl
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-13 17:17
 **/

@Service
@Transactional(propagation = Propagation.REQUIRED)//添加事务传播特性
public class AccountsServiceImpl implements AccountsService {
    @Autowired
    AccountsMapper accountsMapper;
    @Override
    public int save(Accounts accounts) {
        int num;
        num = accountsMapper.save(accounts);
        //System.out.println(1/0);
        return num;
    }
}
