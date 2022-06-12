package com.weifang.controller;

import com.weifang.pojo.User;
import com.weifang.service.UserService;
import com.weifang.service.impl.UserServiceImpl;

/**
 * @Program: spring
 * @ClassName: UserController
 * @Version: 1.0
 * @Description: 界面层
 * @Author: zhezhi
 * @Create-Date: 2022-06-12 14:07
 **/

public class UserController {

    //界面层的功能实现，对外提供访问的功能
    private final UserService userService = new UserServiceImpl();
    public int insert(User user) {
         return userService.insert(user);
    }

}
