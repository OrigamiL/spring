package com.weifang.service.impl;

import com.weifang.mapper.AccountsMapper;
import com.weifang.pojo.Accounts;
import com.weifang.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Program: spring
 * @ClassName: AccountsServiceImpl
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-13 17:17
 **/

public class AccountsServiceImpl implements AccountsService {
    @Autowired
    AccountsMapper accountsMapper;
    @Override
    public int save(Accounts accounts) {
        return accountsMapper.save(accounts);
    }
}
