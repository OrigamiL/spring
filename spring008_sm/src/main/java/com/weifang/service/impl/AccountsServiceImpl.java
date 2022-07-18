package com.weifang.service.impl;

import com.weifang.mapper.AccountsMapper;
import com.weifang.pojo.Accounts;
import com.weifang.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
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
/*@Transactional(propagation = Propagation.REQUIRED,      //事务传播特性：必被包含事务（增删改必用）
        noRollbackForClassName = {"ArithmeticException"}//指定发生什么异常不回滚
        //noRollbackFor = ArithmeticException.class     //指定发生什么异常不回滚
        //rollbackForClassName = ""                     //指定发生什么异常必须回滚
        // RollbackFor=      .class                     //指定发生什么异常必须回滚
        ,timeout = -1                                   //连接超时设置，默认为-1，表示永不超时
        ,readOnly = false                               //默认为false，如果是查询操作，必须设置为true
        ,isolation = Isolation.DEFAULT                  //数据库的隔离级别，默认可重复读
    )*/

//@Transactional(propagation = Propagation.NEVER)
public class AccountsServiceImpl implements AccountsService {
    @Autowired
    AccountsMapper accountsMapper;
    @Override
    public int save(Accounts accounts) {
        int num;
        num = accountsMapper.save(accounts);
        System.out.println(1/0);
        return num;
    }
}
