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
        UserController controller = new UserController();
        int insert = controller.insert(new User(1, "zhang", 13));
        System.out.println(insert);
    }
    @Test
    public void testAnnotation() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController)ac.getBean("userController");
        userController.insert(new User(1,"赵六",22));
    }
}
