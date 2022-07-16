package com.weifang;

import com.weifang.pojo.Accounts;
import com.weifang.pojo.Users;
import com.weifang.service.AccountsService;
import com.weifang.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: spring
 * @ClassName: MyTest01
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-13 16:15
 **/

public class MyTest01 {
    @Test
    public void testInsert() {
        Users users = new Users(2,"张三","123");
        ApplicationContext ac = new ClassPathXmlApplicationContext("total.xml");
        UsersService service = (UsersService) ac.getBean("usersServiceImpl");
        int insert = service.insert(users);
        System.out.println(insert);
    }
    @Test
    public void testAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        AccountsService service = (AccountsService) ac.getBean("accountsServiceImpl");
        System.out.println(service.getClass());
        int save = service.save(new Accounts(11, "zhangSan", "123"));
        System.out.println("返回值："+save);
    }
}
