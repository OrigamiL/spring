package com;

import com.weifang.controller.UserController;
import com.weifang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: spring
 * @ClassName: MyTest
 * @Version: 1.0
 * @Description: 测试三层
 * @Author: zhezhi
 * @Create-Date: 2022-06-12 14:11
 **/

public class MyTest {
    @Test
    public void testThreeLevel() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("total.xml");
        UserController userController = (UserController) ac.getBean("userController");
        userController.insert(new User(111,"张三",21));
    }
    @Test
    public void testFenC() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("all.xml");
        UserController userController = (UserController) ac.getBean("userController");
        userController.insert(new User(222,"李四",22));
    }
}
