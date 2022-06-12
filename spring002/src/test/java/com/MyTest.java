package com;

import com.weifang.controller.UserController;
import com.weifang.pojo.User;
import org.junit.Test;

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
}
