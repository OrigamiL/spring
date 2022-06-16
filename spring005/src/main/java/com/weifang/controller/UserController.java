package com.weifang.controller;

import com.weifang.pojo.User;
import com.weifang.service.UserService;
import com.weifang.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Program: spring
 * @ClassName: UserController
 * @Version: 1.0
 * @Description: 界面层
 * @Author: zhezhi
 * @Create-Date: 2022-06-12 14:07
 **/

@Controller
public class UserController {

    //界面层的功能实现，对外提供访问的功能
    @Autowired
    //@Qualifier("userServiceImpl")
    private UserService userService;
    public int insert(User user) {
         return userService.insert(user);
    }

}
